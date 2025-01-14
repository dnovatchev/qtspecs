<?xml version='1.0'?>
<xsl:stylesheet version="3.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:fn="http://www.w3.org/2005/xpath-functions"
   xmlns:fos="http://www.w3.org/xpath-functions/spec/namespace"
   xmlns:xs="http://www.w3.org/2001/XMLSchema"
  xmlns="http://www.w3.org/2010/09/qt-fots-catalog" exclude-result-prefixes="#all"
  expand-text="true">

  <!-- 
  This stylesheet takes the function catalog as input, and accesses the fos:test elements
  to produce a QT3 test set which runs the tests and thereby tests that all the
  examples are correct.
  
  It is derived from the old generate-test-stylesheet.xsl stylesheet.
  
  Typical invocation, in directory qtspecs/specifications/xpath-functions-40 :
  -t -xsl:style/generate-qt3-test-set.xsl -s:src/function-catalog.xml -val -o:/Users/mike/GitHub/qt4cg/qt4tests/app/fo-spec-examples.xml
-->

  <xsl:output method="xml" indent="yes" saxon:double-space="test-case"
    xmlns:saxon="http://saxon.sf.net/"
    cdata-section-elements="assert-xml"/>
  
  <xsl:param name="qt4tests-dir" static="yes" select="'../../../build/qt4tests/'"/>

  <xsl:import-schema namespace="http://www.w3.org/xpath-functions/spec/namespace"
    schema-location="../src/fos.xsd"/>
  <xsl:import-schema namespace="http://www.w3.org/2005/xpath-functions"
    schema-location="../src/xpath-functions.xsd"/>
  <xsl:import-schema namespace="http://www.w3.org/2010/09/qt-fots-catalog"
    _schema-location="{$qt4tests-dir}catalog-schema.xsd"/>
  
  <xsl:param name="run-by" select="'Michael Kay'"/>

  <xsl:mode typed="strict"/>

  <xsl:template match="/">
    <xsl:message>Running generate-qt3-test-set using {system-property('xsl:product-name')} {system-property('xsl:product-version')}</xsl:message>
    <xsl:document validation="strict">
      <xsl:for-each select="1 to 20">
        <xsl:comment>DO NOT EDIT: GENERATED BY generate-qt3-test-set.xsl</xsl:comment>
        <xsl:text>&#xa;</xsl:text>
      </xsl:for-each>
      <test-set name="app-spec-examples">
        <description>Tests the example code in the F+O 4.0 specification</description>

        <environment name="global">
          <namespace prefix="math" uri="http://www.w3.org/2005/xpath-functions/math"/>
          <namespace prefix="map" uri="http://www.w3.org/2005/xpath-functions/map"/>
          <namespace prefix="array" uri="http://www.w3.org/2005/xpath-functions/array"/>
          <decimal-format name="ch" decimal-separator="&#xb7;" grouping-separator="&#x2b9;"/>
          <decimal-format name="de" decimal-separator="," grouping-separator="."/>
          <decimal-format name="fortran" exponent-separator="E"/>
        </environment>

        <dependency type="spec" value="XP40+ XQ40+"/>

        <xsl:apply-templates
          select="//fos:function[not(@prefix = 'op')]//fos:test[not(@implicit-timezone)]"/>


      </test-set>
    </xsl:document>
  </xsl:template>

  <xsl:template match="fos:test">
    <xsl:variable name="fos-test" select="."/>
    <xsl:variable name="fos-function" select="ancestor::fos:function"/>
    <xsl:variable name="n">
      <xsl:number level="any" from="fos:function" format="001"/>
    </xsl:variable>
    <test-case name="fo-test-{($fos-function/@prefix, 'fn')[1]}-{$fos-function/@name}-{$n}">     
      <description>Test case for {$fos-function/((@prefix, 'fn')[1] || ':' || @name)}</description>
      <created by="{$run-by} using generate-qt3-test-set.xsl" on="{adjust-date-to-timezone(current-date(), ())}"/>
      <xsl:choose>
        <xsl:when test="@default-collation">
          <environment>
            <namespace prefix="math" uri="http://www.w3.org/2005/xpath-functions/math"/>
            <namespace prefix="map" uri="http://www.w3.org/2005/xpath-functions/map"/>
            <namespace prefix="array" uri="http://www.w3.org/2005/xpath-functions/array"/>
            <xsl:if test="@default-collation">
              <collation uri="{@default-collation}" default="true"/>
            </xsl:if>
          </environment>
        </xsl:when>
        <xsl:otherwise>
          <environment ref="global"/>
        </xsl:otherwise>
      </xsl:choose>
      <xsl:if test="@spec = 'XQuery'">
        <dependency type="spec" value="XQ40+"/>
      </xsl:if>
      <xsl:if test="xs:boolean(@schema-aware)">
        <dependency type="feature" value="schemaImport"/>
        <dependency type="feature" value="schemaValidation"/>
      </xsl:if>
      <test>
        <xsl:for-each select="id(@use)">
          {"let $" || @name || " := " || @select}
          <xsl:value-of select="text()" disable-output-escaping="yes"/>
          {" return 
"}
        </xsl:for-each>
        {fos:expression}
      </test>
      <result>
        <xsl:choose>
          <xsl:when test="exists(fos:test-assertion)">
            <xsl:copy-of select="fos:test-assertion/*:result/*"/>           
          </xsl:when>
          <xsl:when test="fos:result[matches(., '^\s*&lt;')] and not(contains(fos:expression, 'serialize'))">
            <!-- Drop leading whitespace to keep the XML parser happy -->
            <xsl:variable name="trimmed" select="replace(fos:result, '^\s+&lt;', '&lt;')"/>
            <xsl:choose>
              <xsl:when test="fos:result/@normalize-space eq true()">
               <xsl:variable name="stripped">
                 <xsl:try>
                   <xsl:apply-templates select="parse-xml($trimmed)" mode="strip-space"/>
                   <xsl:catch>
                     <xsl:message expand-text="1">** Failure in parse-xml on fos:result of {$fos-function/@name}-{$n}</xsl:message>
                     <!--<xsl:message>:::{$trimmed}:::</xsl:message>-->
                     <substitute-for-unparseable-result-xml/>
                   </xsl:catch>
                 </xsl:try>
               </xsl:variable>
                <assert-xml ignore-prefixes="{(fos:result/@ignore-prefixes, false())[1]}">{serialize($stripped)}</assert-xml>
              </xsl:when>
              <xsl:otherwise>
                <assert-xml ignore-prefixes="{(fos:result/@ignore-prefixes, false())[1]}">{$trimmed}</assert-xml>
              </xsl:otherwise>
            </xsl:choose>           
          </xsl:when>
          <xsl:when test="fos:result[@approx]">
            <assert>abs($result - {fos:result}) lt 1e-5</assert>
          </xsl:when>
          <xsl:when test="fos:result[@allow-permutation]">
            <assert-permutation>{fos:result}</assert-permutation>
          </xsl:when>
          <xsl:when test="fos:result[. = 'true()']">
            <assert-true/>
          </xsl:when>
          <xsl:when test="fos:result[. = 'false()']">
            <assert-false/>
          </xsl:when>
          <xsl:when test="fos:result">
            <assert-deep-eq>{fos:result}</assert-deep-eq>
          </xsl:when>
          <xsl:when test="fos:error-result">
            <error code="{fos:error-result/@error-code ! (if (contains(.,':')) then '*' else .)}"/>
          </xsl:when>
        </xsl:choose>
      </result>
    </test-case>
  </xsl:template>

  
  <xsl:mode name="strip-space" on-no-match="shallow-copy"/>
  <xsl:template match="@escaped-key[. = false()]" mode="strip-space"/>
  <xsl:template match="@escaped[. = false()]" mode="strip-space"/>
  <xsl:template match="text()[not(normalize-space())][not(parent::fn:match)][not(parent::fn:non-match)]" mode="strip-space"/>


</xsl:stylesheet>
