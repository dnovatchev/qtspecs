/* Generated By:JJTree&JavaCC: Do not edit this line. XParserConstants.java */
package org.w3c.xqparser;

public interface XParserConstants {

  int EOF = 0;
  int DirCommentContentDoubleDashError = 167;
  int RbraceError = 168;
  int LeftAngleBracketError = 169;
  int AmpersandError = 170;
  int PITargetError = 171;
  int NumericLiteralError = 172;
  int Slash = 173;
  int SlashSlash = 174;
  int Greatest = 175;
  int Least = 176;
  int External = 177;
  int Lbrace = 178;
  int Rbrace = 179;
  int Ascending = 180;
  int Descending = 181;
  int LeftAngleBracket = 182;
  int Plus = 183;
  int Minus = 184;
  int PragmaOpen = 185;
  int PragmaClose = 186;
  int URIQualifiedStar = 187;
  int NCNameColonStar = 188;
  int StarColonNCName = 189;
  int TagQName = 190;
  int StartTagClose = 191;
  int EmptyTagClose = 192;
  int EndTagOpen = 193;
  int EndTagQName = 194;
  int EndTagClose = 195;
  int ValueIndicator = 196;
  int OpenQuot = 197;
  int CloseQuot = 198;
  int OpenApos = 199;
  int CloseApos = 200;
  int LCurlyBraceEscape = 201;
  int RCurlyBraceEscape = 202;
  int DirCommentStart = 203;
  int DirCommentEnd = 204;
  int DirCommentContentChar = 205;
  int DirCommentContentDashChar = 206;
  int ProcessingInstructionStart = 207;
  int ProcessingInstructionEnd = 208;
  int CdataSectionStart = 209;
  int CdataSectionEnd = 210;
  int IntegerLiteral = 211;
  int DecimalLiteral = 212;
  int DoubleLiteral = 213;
  int StringLiteral = 214;
  int URIQualifiedName = 215;
  int BracedURILiteral = 216;
  int PredefinedEntityRef = 217;
  int EscapeQuot = 218;
  int EscapeApos = 219;
  int ElementContentChar = 220;
  int QuotAttrContentChar = 221;
  int AposAttrContentChar = 222;
  int PITarget = 223;
  int CharRef = 224;
  int QNameToken = 225;
  int NCNameTok = 226;
  int S = 227;
  int Char = 228;
  int Digits = 229;
  int HexDigits = 230;
  int WhitespaceChar = 231;
  int LocalPart = 232;
  int Nmstart = 233;
  int Nmchar = 234;
  int Letter = 235;
  int BaseChar = 236;
  int Ideographic = 237;
  int CombiningChar = 238;
  int Digit = 239;
  int Extender = 240;
  int CommentStart = 241;
  int CommentEnd = 242;
  int CommentContent = 243;
  int ImplicitlyAllowedWhitespace = 244;

  int DEFAULT = 0;
  int XML_COMMENT = 1;
  int QUOT_ATTRIBUTE_CONTENT = 2;
  int APOS_ATTRIBUTE_CONTENT = 3;
  int ELEMENT_CONTENT = 4;
  int PROCESSING_INSTRUCTION = 5;
  int PRAGMA_2 = 6;
  int PRAGMA_3 = 7;
  int START_TAG = 8;
  int END_TAG = 9;
  int PROCESSING_INSTRUCTION_CONTENT = 10;
  int CDATA_SECTION = 11;
  int PRAGMA_1 = 12;
  int EXPR_COMMENT = 13;

  String[] tokenImage = {
    "<EOF>",
    "\"%%%\"",
    "\"xquery\"",
    "\"encoding\"",
    "\"version\"",
    "\"module\"",
    "\"namespace\"",
    "\"=\"",
    "\";\"",
    "\"declare\"",
    "\"boundary-space\"",
    "\"preserve\"",
    "\"strip\"",
    "\"default\"",
    "\"collation\"",
    "\"base-uri\"",
    "\"construction\"",
    "\"ordering\"",
    "\"ordered\"",
    "\"unordered\"",
    "\"order\"",
    "\"empty\"",
    "\"copy-namespaces\"",
    "\",\"",
    "\"no-preserve\"",
    "\"inherit\"",
    "\"no-inherit\"",
    "\"decimal-format\"",
    "\"decimal-separator\"",
    "\"grouping-separator\"",
    "\"infinity\"",
    "\"minus-sign\"",
    "\"NaN\"",
    "\"percent\"",
    "\"per-mille\"",
    "\"zero-digit\"",
    "\"digit\"",
    "\"pattern-separator\"",
    "\"import\"",
    "\"schema\"",
    "\"at\"",
    "\"element\"",
    "\"function\"",
    "\"updating\"",
    "\"%\"",
    "\"(\"",
    "\")\"",
    "\"variable\"",
    "\"$\"",
    "\":=\"",
    "\"context\"",
    "\"item\"",
    "\"as\"",
    "\"option\"",
    "\"for\"",
    "\"in\"",
    "\"allowing\"",
    "\"let\"",
    "\"tumbling\"",
    "\"window\"",
    "\"sliding\"",
    "\"start\"",
    "\"when\"",
    "\"only\"",
    "\"end\"",
    "\"previous\"",
    "\"next\"",
    "\"count\"",
    "\"where\"",
    "\"group\"",
    "\"by\"",
    "\"stable\"",
    "\"return\"",
    "\"some\"",
    "\"every\"",
    "\"satisfies\"",
    "\"switch\"",
    "\"case\"",
    "\"typeswitch\"",
    "\"|\"",
    "\"if\"",
    "\"then\"",
    "\"else\"",
    "\"try\"",
    "\"catch\"",
    "\"or\"",
    "\"and\"",
    "\"||\"",
    "\"to\"",
    "\"*\"",
    "\"div\"",
    "\"idiv\"",
    "\"mod\"",
    "\"union\"",
    "\"intersect\"",
    "\"except\"",
    "\"instance\"",
    "\"of\"",
    "\"treat\"",
    "\"castable\"",
    "\"cast\"",
    "\"transform\"",
    "\"with\"",
    "\"!=\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"eq\"",
    "\"ne\"",
    "\"lt\"",
    "\"le\"",
    "\"gt\"",
    "\"ge\"",
    "\"is\"",
    "\"<<\"",
    "\">>\"",
    "\"validate\"",
    "\"type\"",
    "\"lax\"",
    "\"strict\"",
    "\"!\"",
    "\"child\"",
    "\"::\"",
    "\"descendant\"",
    "\"attribute\"",
    "\"self\"",
    "\"descendant-or-self\"",
    "\"following-sibling\"",
    "\"following\"",
    "\"@\"",
    "\"parent\"",
    "\"ancestor\"",
    "\"preceding-sibling\"",
    "\"preceding\"",
    "\"ancestor-or-self\"",
    "\"..\"",
    "\"[\"",
    "\"]\"",
    "\".\"",
    "\"?\"",
    "\"document\"",
    "\"text\"",
    "\"comment\"",
    "\"processing-instruction\"",
    "\"#\"",
    "\"empty-sequence\"",
    "\"node\"",
    "\"document-node\"",
    "\"namespace-node\"",
    "\"schema-attribute\"",
    "\"schema-element\"",
    "\"revalidation\"",
    "\"skip\"",
    "\"first\"",
    "\"last\"",
    "\"into\"",
    "\"after\"",
    "\"before\"",
    "\"insert\"",
    "\"nodes\"",
    "\"delete\"",
    "\"replace\"",
    "\"value\"",
    "\"rename\"",
    "\"invoke\"",
    "\"copy\"",
    "\"modify\"",
    "<DirCommentContentDoubleDashError>",
    "\"}\"",
    "\"<\"",
    "\"&\"",
    "<PITargetError>",
    "<NumericLiteralError>",
    "\"/\"",
    "\"//\"",
    "\"greatest\"",
    "\"least\"",
    "\"external\"",
    "\"{\"",
    "\"}\"",
    "\"ascending\"",
    "\"descending\"",
    "\"<\"",
    "\"+\"",
    "\"-\"",
    "\"(#\"",
    "\"#)\"",
    "<URIQualifiedStar>",
    "<NCNameColonStar>",
    "<StarColonNCName>",
    "<TagQName>",
    "\">\"",
    "\"/>\"",
    "\"</\"",
    "<EndTagQName>",
    "\">\"",
    "\"=\"",
    "\"\\\"\"",
    "\"\\\"\"",
    "\"\\\'\"",
    "\"\\\'\"",
    "\"{{\"",
    "\"}}\"",
    "\"<!--\"",
    "\"-->\"",
    "<DirCommentContentChar>",
    "<DirCommentContentDashChar>",
    "\"<?\"",
    "\"?>\"",
    "\"<![CDATA[\"",
    "<CdataSectionEnd>",
    "<IntegerLiteral>",
    "<DecimalLiteral>",
    "<DoubleLiteral>",
    "<StringLiteral>",
    "<URIQualifiedName>",
    "<BracedURILiteral>",
    "<PredefinedEntityRef>",
    "\"\\\"\\\"\"",
    "\"\\\'\\\'\"",
    "<ElementContentChar>",
    "<QuotAttrContentChar>",
    "<AposAttrContentChar>",
    "<PITarget>",
    "<CharRef>",
    "<QNameToken>",
    "<NCNameTok>",
    "<S>",
    "<Char>",
    "<Digits>",
    "<HexDigits>",
    "<WhitespaceChar>",
    "<LocalPart>",
    "<Nmstart>",
    "<Nmchar>",
    "<Letter>",
    "<BaseChar>",
    "<Ideographic>",
    "<CombiningChar>",
    "<Digit>",
    "<Extender>",
    "\"(:\"",
    "\":)\"",
    "<CommentContent>",
    "<ImplicitlyAllowedWhitespace>",
  };

}