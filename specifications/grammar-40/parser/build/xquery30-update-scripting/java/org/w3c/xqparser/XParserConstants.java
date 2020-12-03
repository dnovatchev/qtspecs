/* Generated By:JJTree&JavaCC: Do not edit this line. XParserConstants.java */
package org.w3c.xqparser;

public interface XParserConstants {

  int EOF = 0;
  int DirCommentContentDoubleDashError = 171;
  int RbraceError = 172;
  int LeftAngleBracketError = 173;
  int AmpersandError = 174;
  int PITargetError = 175;
  int NumericLiteralError = 176;
  int Slash = 177;
  int SlashSlash = 178;
  int Greatest = 179;
  int Least = 180;
  int External = 181;
  int Lbrace = 182;
  int Rbrace = 183;
  int Ascending = 184;
  int Descending = 185;
  int LeftAngleBracket = 186;
  int Plus = 187;
  int Minus = 188;
  int PragmaOpen = 189;
  int PragmaClose = 190;
  int URIQualifiedStar = 191;
  int NCNameColonStar = 192;
  int StarColonNCName = 193;
  int TagQName = 194;
  int StartTagClose = 195;
  int EmptyTagClose = 196;
  int EndTagOpen = 197;
  int EndTagQName = 198;
  int EndTagClose = 199;
  int ValueIndicator = 200;
  int OpenQuot = 201;
  int CloseQuot = 202;
  int OpenApos = 203;
  int CloseApos = 204;
  int LCurlyBraceEscape = 205;
  int RCurlyBraceEscape = 206;
  int DirCommentStart = 207;
  int DirCommentEnd = 208;
  int DirCommentContentChar = 209;
  int DirCommentContentDashChar = 210;
  int ProcessingInstructionStart = 211;
  int ProcessingInstructionEnd = 212;
  int CdataSectionStart = 213;
  int CdataSectionEnd = 214;
  int IntegerLiteral = 215;
  int DecimalLiteral = 216;
  int DoubleLiteral = 217;
  int StringLiteral = 218;
  int URIQualifiedName = 219;
  int BracedURILiteral = 220;
  int PredefinedEntityRef = 221;
  int EscapeQuot = 222;
  int EscapeApos = 223;
  int ElementContentChar = 224;
  int QuotAttrContentChar = 225;
  int AposAttrContentChar = 226;
  int PITarget = 227;
  int CharRef = 228;
  int QNameToken = 229;
  int NCNameTok = 230;
  int S = 231;
  int Char = 232;
  int Digits = 233;
  int HexDigits = 234;
  int WhitespaceChar = 235;
  int LocalPart = 236;
  int Nmstart = 237;
  int Nmchar = 238;
  int Letter = 239;
  int BaseChar = 240;
  int Ideographic = 241;
  int CombiningChar = 242;
  int Digit = 243;
  int Extender = 244;
  int CommentStart = 245;
  int CommentEnd = 246;
  int CommentContent = 247;
  int ImplicitlyAllowedWhitespace = 248;

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
    "\"block\"",
    "\"exit\"",
    "\"returning\"",
    "\"while\"",
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