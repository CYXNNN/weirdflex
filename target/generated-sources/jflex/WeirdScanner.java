// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/jflex/weirdflex.jflex

import java_cup.runtime.Symbol;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public final class WeirdScanner implements java_cup.runtime.Scanner, sym {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u0100"+
    "\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\3\u1f00\1\u4000"+
    "\1\u4100\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800"+
    "\1\u1f00\1\u4900\1\u1f00\1\u4a00\1\u4b00\2\u1f00\3\u0100\1\u4c00"+
    "\1\u4d00\1\u4e00\12\u1f00\4\u0100\1\u4f00\17\u1f00\2\u0100\1\u5000"+
    "\41\u1f00\2\u0100\1\u5100\1\u5200\3\u1f00\1\u5300\27\u0100\1\u5400"+
    "\2\u0100\1\u5500\45\u1f00\1\u0100\1\u5600\1\u5700\11\u1f00\1\u5800"+
    "\27\u1f00\1\u5900\1\u5a00\1\u5b00\1\u5c00\20\u1f00\1\u5d00\1\u4e00"+
    "\4\u1f00\1\u5e00\21\u1f00\246\u0100\1\u5f00\20\u0100\1\u6000\1\u6100"+
    "\25\u0100\1\u6200\34\u0100\1\u6300\14\u1f00\2\u0100\1\u6400\u0e05\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\0\1\3\22\0\1\1\1\4"+
    "\1\5\1\6\1\7\2\0\1\10\2\0\1\11\1\12"+
    "\1\13\1\14\1\0\1\15\12\16\1\17\1\0\1\20"+
    "\1\21\1\22\2\0\32\7\1\0\1\23\2\0\1\7"+
    "\1\0\1\24\1\7\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\2\7\1\34\1\35\1\36\1\37\2\7"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\3\7\47\0"+
    "\4\7\4\0\1\7\12\0\1\7\4\0\1\7\5\0"+
    "\27\7\1\0\37\7\1\0\u01ca\7\4\0\14\7\16\0"+
    "\5\7\7\0\1\7\1\0\1\7\201\0\5\7\1\0"+
    "\2\7\2\0\4\7\1\0\1\7\6\0\1\7\1\0"+
    "\3\7\1\0\1\7\1\0\24\7\1\0\123\7\1\0"+
    "\213\7\10\0\246\7\1\0\46\7\2\0\1\7\7\0"+
    "\47\7\7\0\1\7\100\0\33\7\5\0\3\7\30\0"+
    "\1\7\24\0\53\7\43\0\2\7\1\0\143\7\1\0"+
    "\1\7\17\0\2\7\7\0\2\7\12\0\3\7\2\0"+
    "\1\7\20\0\1\7\1\0\36\7\35\0\131\7\13\0"+
    "\1\7\30\0\41\7\11\0\2\7\4\0\1\7\5\0"+
    "\26\7\4\0\1\7\11\0\1\7\3\0\1\7\27\0"+
    "\31\7\7\0\13\7\65\0\25\7\1\0\10\7\106\0"+
    "\66\7\3\0\1\7\22\0\1\7\7\0\12\7\17\0"+
    "\20\7\4\0\10\7\2\0\2\7\2\0\26\7\1\0"+
    "\7\7\1\0\1\7\3\0\4\7\3\0\1\7\20\0"+
    "\1\7\15\0\2\7\1\0\3\7\16\0\4\7\7\0"+
    "\2\7\10\0\6\7\4\0\2\7\2\0\26\7\1\0"+
    "\7\7\1\0\2\7\1\0\2\7\1\0\2\7\37\0"+
    "\4\7\1\0\1\7\23\0\3\7\20\0\11\7\1\0"+
    "\3\7\1\0\26\7\1\0\7\7\1\0\2\7\1\0"+
    "\5\7\3\0\1\7\22\0\1\7\17\0\2\7\17\0"+
    "\1\7\7\0\1\7\13\0\10\7\2\0\2\7\2\0"+
    "\26\7\1\0\7\7\1\0\2\7\1\0\5\7\3\0"+
    "\1\7\36\0\2\7\1\0\3\7\17\0\1\7\21\0"+
    "\1\7\1\0\6\7\3\0\3\7\1\0\4\7\3\0"+
    "\2\7\1\0\1\7\1\0\2\7\3\0\2\7\3\0"+
    "\3\7\3\0\14\7\26\0\1\7\50\0\1\7\13\0"+
    "\10\7\1\0\3\7\1\0\27\7\1\0\20\7\3\0"+
    "\1\7\32\0\3\7\5\0\2\7\36\0\1\7\4\0"+
    "\10\7\1\0\3\7\1\0\27\7\1\0\12\7\1\0"+
    "\5\7\3\0\1\7\40\0\1\7\1\0\2\7\17\0"+
    "\2\7\22\0\10\7\1\0\3\7\1\0\51\7\2\0"+
    "\1\7\20\0\1\7\5\0\3\7\10\0\3\7\30\0"+
    "\6\7\5\0\22\7\3\0\30\7\1\0\11\7\1\0"+
    "\1\7\2\0\7\7\72\0\60\7\1\0\2\7\13\0"+
    "\10\7\72\0\2\7\1\0\1\7\2\0\2\7\1\0"+
    "\1\7\2\0\1\7\6\0\4\7\1\0\7\7\1\0"+
    "\3\7\1\0\1\7\1\0\1\7\2\0\2\7\1\0"+
    "\4\7\1\0\2\7\11\0\1\7\2\0\5\7\1\0"+
    "\1\7\25\0\4\7\40\0\1\7\77\0\10\7\1\0"+
    "\44\7\33\0\5\7\163\0\53\7\24\0\1\7\20\0"+
    "\6\7\4\0\4\7\3\0\1\7\3\0\2\7\7\0"+
    "\3\7\4\0\15\7\14\0\1\7\21\0\46\7\1\0"+
    "\1\7\5\0\1\7\2\0\53\7\1\0\115\7\1\0"+
    "\4\7\2\0\7\7\1\0\1\7\1\0\4\7\2\0"+
    "\51\7\1\0\4\7\2\0\41\7\1\0\4\7\2\0"+
    "\7\7\1\0\1\7\1\0\4\7\2\0\17\7\1\0"+
    "\71\7\1\0\4\7\2\0\103\7\45\0\20\7\20\0"+
    "\126\7\2\0\6\7\3\0\u016c\7\2\0\21\7\1\0"+
    "\32\7\5\0\113\7\3\0\13\7\7\0\15\7\1\0"+
    "\4\7\16\0\22\7\16\0\22\7\16\0\15\7\1\0"+
    "\3\7\17\0\64\7\43\0\1\7\3\0\2\7\103\0"+
    "\130\7\10\0\5\7\2\0\42\7\1\0\1\7\5\0"+
    "\106\7\12\0\37\7\61\0\36\7\2\0\5\7\13\0"+
    "\54\7\4\0\32\7\66\0\27\7\11\0\65\7\122\0"+
    "\1\7\135\0\57\7\21\0\7\7\67\0\36\7\15\0"+
    "\2\7\12\0\54\7\32\0\44\7\51\0\3\7\12\0"+
    "\44\7\2\0\11\7\140\0\4\7\1\0\4\7\3\0"+
    "\2\7\11\0\300\7\100\0\26\7\2\0\6\7\2\0"+
    "\46\7\2\0\6\7\2\0\10\7\1\0\1\7\1\0"+
    "\1\7\1\0\1\7\1\0\37\7\2\0\65\7\1\0"+
    "\7\7\1\0\1\7\3\0\3\7\1\0\7\7\3\0"+
    "\4\7\2\0\6\7\4\0\15\7\5\0\3\7\1\0"+
    "\7\7\102\0\2\7\23\0\1\7\34\0\1\7\15\0"+
    "\1\7\20\0\15\7\3\0\40\7\102\0\1\7\4\0"+
    "\1\7\2\0\12\7\1\0\1\7\3\0\5\7\6\0"+
    "\1\7\1\0\1\7\1\0\1\7\1\0\4\7\1\0"+
    "\13\7\2\0\4\7\5\0\5\7\4\0\1\7\21\0"+
    "\51\7\u0177\0\57\7\1\0\57\7\1\0\205\7\6\0"+
    "\4\7\3\0\2\7\14\0\46\7\1\0\1\7\5\0"+
    "\1\7\2\0\70\7\7\0\1\7\20\0\27\7\11\0"+
    "\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0"+
    "\7\7\1\0\7\7\1\0\7\7\1\0\7\7\120\0"+
    "\1\7\325\0\3\7\31\0\11\7\7\0\5\7\2\0"+
    "\5\7\4\0\126\7\6\0\3\7\1\0\132\7\1\0"+
    "\4\7\5\0\52\7\2\0\136\7\21\0\33\7\65\0"+
    "\306\7\112\0\353\7\25\0\215\7\103\0\56\7\2\0"+
    "\15\7\3\0\20\7\12\0\2\7\24\0\57\7\20\0"+
    "\37\7\2\0\120\7\47\0\11\7\2\0\147\7\2\0"+
    "\44\7\1\0\10\7\77\0\13\7\1\0\3\7\1\0"+
    "\4\7\1\0\27\7\25\0\1\7\7\0\64\7\16\0"+
    "\62\7\76\0\6\7\3\0\1\7\1\0\1\7\14\0"+
    "\34\7\12\0\27\7\31\0\35\7\7\0\57\7\34\0"+
    "\1\7\20\0\5\7\1\0\12\7\12\0\5\7\1\0"+
    "\51\7\27\0\3\7\1\0\10\7\24\0\27\7\3\0"+
    "\1\7\3\0\62\7\1\0\1\7\3\0\2\7\2\0"+
    "\5\7\2\0\1\7\1\0\1\7\30\0\3\7\2\0"+
    "\13\7\7\0\3\7\14\0\6\7\2\0\6\7\2\0"+
    "\6\7\11\0\7\7\1\0\7\7\1\0\53\7\1\0"+
    "\12\7\12\0\163\7\35\0\244\7\14\0\27\7\4\0"+
    "\61\7\4\0\156\7\2\0\152\7\46\0\7\7\14\0"+
    "\5\7\5\0\1\7\1\0\12\7\1\0\15\7\1\0"+
    "\5\7\1\0\1\7\1\0\2\7\1\0\2\7\1\0"+
    "\154\7\41\0\153\7\22\0\100\7\2\0\66\7\50\0"+
    "\15\7\66\0\2\7\30\0\3\7\31\0\1\7\6\0"+
    "\5\7\1\0\207\7\7\0\1\7\34\0\32\7\4\0"+
    "\1\7\1\0\32\7\13\0\131\7\3\0\6\7\2\0"+
    "\6\7\2\0\6\7\2\0\3\7\3\0\2\7\3\0"+
    "\2\7\31\0\14\7\1\0\32\7\1\0\23\7\1\0"+
    "\2\7\1\0\17\7\2\0\16\7\42\0\173\7\105\0"+
    "\65\7\u010b\0\35\7\3\0\61\7\57\0\40\7\15\0"+
    "\36\7\5\0\46\7\12\0\36\7\2\0\44\7\4\0"+
    "\10\7\1\0\5\7\52\0\236\7\22\0\44\7\4\0"+
    "\44\7\4\0\50\7\10\0\64\7\234\0\67\7\11\0"+
    "\26\7\12\0\10\7\230\0\6\7\2\0\1\7\1\0"+
    "\54\7\1\0\2\7\3\0\1\7\2\0\27\7\12\0"+
    "\27\7\11\0\37\7\101\0\23\7\1\0\2\7\12\0"+
    "\26\7\12\0\32\7\106\0\70\7\6\0\2\7\100\0"+
    "\1\7\17\0\4\7\1\0\3\7\1\0\33\7\54\0"+
    "\35\7\3\0\35\7\43\0\10\7\1\0\34\7\33\0"+
    "\66\7\12\0\26\7\12\0\23\7\15\0\22\7\156\0"+
    "\111\7\67\0\63\7\15\0\63\7\20\0\65\7\113\0"+
    "\55\7\40\0\31\7\32\0\44\7\51\0\43\7\3\0"+
    "\1\7\14\0\60\7\16\0\4\7\25\0\1\7\1\0"+
    "\1\7\43\0\22\7\1\0\31\7\124\0\7\7\1\0"+
    "\1\7\1\0\4\7\1\0\17\7\1\0\12\7\7\0"+
    "\57\7\46\0\10\7\2\0\2\7\2\0\26\7\1\0"+
    "\7\7\1\0\2\7\1\0\5\7\3\0\1\7\22\0"+
    "\1\7\14\0\5\7\236\0\65\7\22\0\4\7\65\0"+
    "\60\7\24\0\2\7\1\0\1\7\270\0\57\7\51\0"+
    "\4\7\44\0\60\7\24\0\1\7\73\0\53\7\125\0"+
    "\32\7\u0186\0\100\7\37\0\2\7\12\0\50\7\7\0"+
    "\1\7\25\0\1\7\13\0\50\7\2\0\4\7\66\0"+
    "\71\7\7\0\11\7\1\0\45\7\21\0\1\7\61\0"+
    "\36\7\160\0\7\7\1\0\2\7\1\0\46\7\25\0"+
    "\1\7\271\0\232\7\146\0\157\7\21\0\304\7\274\0"+
    "\57\7\321\0\107\7\271\0\71\7\7\0\37\7\161\0"+
    "\36\7\22\0\60\7\20\0\4\7\37\0\25\7\5\0"+
    "\23\7\160\0\105\7\13\0\1\7\102\0\15\7\100\0"+
    "\2\7\36\0\355\7\23\0\363\7\15\0\37\7\121\0"+
    "\u018c\7\4\0\153\7\5\0\15\7\3\0\11\7\7\0"+
    "\12\7\146\0\125\7\1\0\107\7\1\0\2\7\2\0"+
    "\1\7\2\0\2\7\2\0\4\7\1\0\14\7\1\0"+
    "\1\7\1\0\7\7\1\0\101\7\1\0\4\7\2\0"+
    "\10\7\1\0\7\7\1\0\34\7\1\0\4\7\1\0"+
    "\5\7\1\0\1\7\3\0\7\7\1\0\u0154\7\2\0"+
    "\31\7\1\0\31\7\1\0\37\7\1\0\31\7\1\0"+
    "\37\7\1\0\31\7\1\0\37\7\1\0\31\7\1\0"+
    "\37\7\1\0\31\7\1\0\10\7\64\0\305\7\73\0"+
    "\4\7\1\0\33\7\1\0\2\7\1\0\1\7\2\0"+
    "\1\7\1\0\12\7\1\0\4\7\1\0\1\7\1\0"+
    "\1\7\6\0\1\7\4\0\1\7\1\0\1\7\1\0"+
    "\1\7\1\0\3\7\1\0\2\7\1\0\1\7\2\0"+
    "\1\7\1\0\1\7\1\0\1\7\1\0\1\7\1\0"+
    "\1\7\1\0\2\7\1\0\1\7\2\0\4\7\1\0"+
    "\7\7\1\0\4\7\1\0\4\7\1\0\1\7\1\0"+
    "\12\7\1\0\21\7\5\0\3\7\1\0\5\7\1\0"+
    "\21\7\104\0\327\7\51\0\65\7\13\0\336\7\2\0"+
    "\u0182\7\16\0\u0131\7\37\0\36\7\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[25856];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\2\1\3\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\13\3\2\17\1\20\1\12\1\21\10\17\1\22"+
    "\1\23\6\3\1\24\6\3\1\25\1\26\1\27\1\30"+
    "\5\17\1\24\4\17\2\3\1\31\4\3\1\32\3\3"+
    "\1\33\2\17\1\31\5\17\1\33\1\3\1\34\1\3"+
    "\1\35\1\3\1\14\2\3\1\36\1\17\1\34\1\17"+
    "\1\35\2\17\1\36\1\3\1\37\3\3\1\17\1\37"+
    "\2\17\1\40\1\3\1\41\1\42\1\40\1\41\1\42"+
    "\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\114"+
    "\0\114\0\114\0\114\0\114\0\114\0\u010a\0\114\0\114"+
    "\0\u0130\0\114\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214"+
    "\0\u023a\0\u0260\0\u0286\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u02f8"+
    "\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\u0428\0\u044e"+
    "\0\u0474\0\u049a\0\114\0\114\0\u04c0\0\u04e6\0\u050c\0\u0532"+
    "\0\u0558\0\u057e\0\344\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c"+
    "\0\u0662\0\114\0\114\0\114\0\114\0\u0688\0\u06ae\0\u06d4"+
    "\0\u06fa\0\u0720\0\u02f8\0\u0746\0\u076c\0\u0792\0\u07b8\0\u07de"+
    "\0\u0804\0\344\0\u082a\0\u0850\0\u0876\0\u089c\0\344\0\u08c2"+
    "\0\u08e8\0\u090e\0\344\0\u0934\0\u095a\0\u02f8\0\u0980\0\u09a6"+
    "\0\u09cc\0\u09f2\0\u0a18\0\u02f8\0\u0a3e\0\344\0\u0a64\0\344"+
    "\0\u0a8a\0\344\0\u0ab0\0\u0ad6\0\344\0\u0afc\0\u02f8\0\u0b22"+
    "\0\u02f8\0\u0b48\0\u0b6e\0\u02f8\0\u0b94\0\344\0\u0bba\0\u0be0"+
    "\0\u0c06\0\u0c2c\0\u02f8\0\u0c52\0\u0c78\0\344\0\u0c9e\0\344"+
    "\0\344\0\u02f8\0\u02f8\0\u02f8\0\344";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\3\4\1\5\1\3\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\3\1\23\2\7\1\24\1\25\1\26\1\7"+
    "\1\27\1\30\1\31\2\7\1\32\1\33\1\34\1\7"+
    "\1\35\1\7\1\36\1\37\2\4\1\36\1\3\1\6"+
    "\1\36\1\40\5\36\1\41\4\36\1\42\1\43\2\36"+
    "\1\44\1\45\2\36\1\46\4\36\1\47\1\50\1\51"+
    "\1\36\1\52\1\36\47\0\3\4\63\0\1\53\24\0"+
    "\2\6\1\0\43\6\7\0\1\7\14\0\22\7\16\0"+
    "\1\16\50\0\1\54\33\0\1\7\14\0\15\7\1\55"+
    "\4\7\7\0\1\7\14\0\10\7\1\56\1\7\1\57"+
    "\7\7\7\0\1\7\14\0\1\60\16\7\1\61\2\7"+
    "\7\0\1\7\14\0\14\7\1\62\5\7\7\0\1\7"+
    "\14\0\4\7\1\63\15\7\7\0\1\7\14\0\3\7"+
    "\1\64\16\7\7\0\1\7\14\0\13\7\1\65\6\7"+
    "\7\0\1\7\14\0\3\7\1\66\16\7\7\0\1\7"+
    "\14\0\6\7\1\67\13\7\7\0\1\7\14\0\14\7"+
    "\1\70\5\7\7\0\1\7\14\0\1\71\21\7\2\36"+
    "\2\0\1\36\1\0\15\36\1\0\23\36\1\37\2\4"+
    "\1\36\1\0\15\36\1\0\24\36\2\0\1\36\1\0"+
    "\10\36\1\41\4\36\1\0\22\36\10\0\1\72\25\0"+
    "\1\73\1\0\1\74\1\0\1\75\3\0\2\36\2\0"+
    "\1\36\1\0\15\36\1\0\15\36\1\76\6\36\2\0"+
    "\1\36\1\0\15\36\1\0\10\36\1\77\1\36\1\100"+
    "\11\36\2\0\1\36\1\0\15\36\1\0\1\101\16\36"+
    "\1\102\4\36\2\0\1\36\1\0\15\36\1\0\4\36"+
    "\1\103\17\36\2\0\1\36\1\0\15\36\1\0\3\36"+
    "\1\104\20\36\2\0\1\36\1\0\15\36\1\0\6\36"+
    "\1\105\15\36\2\0\1\36\1\0\15\36\1\0\14\36"+
    "\1\106\7\36\2\0\1\36\1\0\15\36\1\0\1\107"+
    "\21\36\7\0\1\7\14\0\10\7\1\110\11\7\7\0"+
    "\1\7\14\0\15\7\1\111\4\7\7\0\1\7\14\0"+
    "\2\7\1\112\17\7\7\0\1\7\14\0\10\7\1\113"+
    "\11\7\7\0\1\7\14\0\12\7\1\114\7\7\7\0"+
    "\1\7\14\0\3\7\1\115\16\7\7\0\1\7\14\0"+
    "\15\7\1\116\4\7\7\0\1\7\14\0\2\7\1\117"+
    "\17\7\7\0\1\7\14\0\16\7\1\120\3\7\7\0"+
    "\1\7\14\0\13\7\1\121\6\7\7\0\1\7\14\0"+
    "\17\7\1\122\2\7\7\0\1\7\14\0\14\7\1\123"+
    "\5\7\2\36\2\0\1\36\1\0\15\36\1\0\10\36"+
    "\1\124\13\36\2\0\1\36\1\0\15\36\1\0\15\36"+
    "\1\125\6\36\2\0\1\36\1\0\15\36\1\0\2\36"+
    "\1\126\21\36\2\0\1\36\1\0\15\36\1\0\10\36"+
    "\1\127\13\36\2\0\1\36\1\0\15\36\1\0\12\36"+
    "\1\130\11\36\2\0\1\36\1\0\15\36\1\0\16\36"+
    "\1\131\5\36\2\0\1\36\1\0\15\36\1\0\13\36"+
    "\1\132\10\36\2\0\1\36\1\0\15\36\1\0\17\36"+
    "\1\133\4\36\2\0\1\36\1\0\15\36\1\0\14\36"+
    "\1\134\5\36\7\0\1\7\14\0\13\7\1\135\6\7"+
    "\7\0\1\7\14\0\3\7\1\136\16\7\7\0\1\7"+
    "\14\0\15\7\1\137\4\7\7\0\1\7\14\0\1\7"+
    "\1\140\20\7\7\0\1\7\14\0\1\141\21\7\7\0"+
    "\1\7\14\0\15\7\1\142\4\7\7\0\1\7\14\0"+
    "\17\7\1\143\2\7\7\0\1\7\14\0\21\7\1\144"+
    "\7\0\1\7\14\0\3\7\1\145\16\7\2\36\2\0"+
    "\1\36\1\0\15\36\1\0\13\36\1\146\10\36\2\0"+
    "\1\36\1\0\15\36\1\0\3\36\1\147\20\36\2\0"+
    "\1\36\1\0\15\36\1\0\15\36\1\150\6\36\2\0"+
    "\1\36\1\0\15\36\1\0\1\36\1\151\22\36\2\0"+
    "\1\36\1\0\15\36\1\0\17\36\1\152\4\36\2\0"+
    "\1\36\1\0\15\36\1\0\21\36\1\153\2\36\2\0"+
    "\1\36\1\0\15\36\1\0\3\36\1\154\16\36\7\0"+
    "\1\7\14\0\12\7\1\155\7\7\7\0\1\7\14\0"+
    "\3\7\1\156\16\7\7\0\1\7\14\0\16\7\1\157"+
    "\3\7\7\0\1\7\14\0\14\7\1\160\5\7\7\0"+
    "\1\7\14\0\11\7\1\161\10\7\2\36\2\0\1\36"+
    "\1\0\15\36\1\0\12\36\1\162\11\36\2\0\1\36"+
    "\1\0\15\36\1\0\3\36\1\163\20\36\2\0\1\36"+
    "\1\0\15\36\1\0\14\36\1\164\7\36\2\0\1\36"+
    "\1\0\15\36\1\0\11\36\1\165\10\36\7\0\1\7"+
    "\14\0\5\7\1\166\14\7\7\0\1\7\14\0\3\7"+
    "\1\167\16\7\7\0\1\7\14\0\12\7\1\170\7\7"+
    "\7\0\1\7\14\0\3\7\1\171\16\7\2\36\2\0"+
    "\1\36\1\0\15\36\1\0\5\36\1\172\16\36\2\0"+
    "\1\36\1\0\15\36\1\0\12\36\1\173\11\36\2\0"+
    "\1\36\1\0\15\36\1\0\3\36\1\174\16\36\7\0"+
    "\1\7\14\0\14\7\1\175\5\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3268];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\4\1\6\11\1\1\2\11\1\1\1\11"+
    "\30\1\2\11\15\1\4\11\100\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private Symbol sym(int sym) {
    return new Symbol(sym);
  }

  private Symbol sym(int sym, Object val) {
    return new Symbol(sym, val);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public WeirdScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("Unrecognized input: " + yytext());
            }
            // fall through
          case 36: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 37: break;
          case 3:
            { return sym(IDENTIFIER, yytext());
            }
            // fall through
          case 38: break;
          case 4:
            { yybegin(STRING); string.setLength(0);
            }
            // fall through
          case 39: break;
          case 5:
            { return sym(TIMES);
            }
            // fall through
          case 40: break;
          case 6:
            { return sym(PLUS);
            }
            // fall through
          case 41: break;
          case 7:
            { return sym(COMMA);
            }
            // fall through
          case 42: break;
          case 8:
            { return sym(MINUS);
            }
            // fall through
          case 43: break;
          case 9:
            { return sym(DIV);
            }
            // fall through
          case 44: break;
          case 10:
            { return sym(INTEGER_LITERAL, new Integer(yytext()));
            }
            // fall through
          case 45: break;
          case 11:
            { return sym(COLON);
            }
            // fall through
          case 46: break;
          case 12:
            { return sym(LT);
            }
            // fall through
          case 47: break;
          case 13:
            { return sym(BECOMES);
            }
            // fall through
          case 48: break;
          case 14:
            { return sym(RT);
            }
            // fall through
          case 49: break;
          case 15:
            { string.append( yytext() );
            }
            // fall through
          case 50: break;
          case 16:
            { yybegin(YYINITIAL);
                                   return sym(STRING_LITERAL, string.toString());
            }
            // fall through
          case 51: break;
          case 17:
            { string.append('\\');
            }
            // fall through
          case 52: break;
          case 18:
            { return sym(NEQ);
            }
            // fall through
          case 53: break;
          case 19:
            { return sym(EQ);
            }
            // fall through
          case 54: break;
          case 20:
            { return sym(IF);
            }
            // fall through
          case 55: break;
          case 21:
            { string.append('\"');
            }
            // fall through
          case 56: break;
          case 22:
            { string.append('\n');
            }
            // fall through
          case 57: break;
          case 23:
            { string.append('\r');
            }
            // fall through
          case 58: break;
          case 24:
            { string.append('\t');
            }
            // fall through
          case 59: break;
          case 25:
            { return sym(END);
            }
            // fall through
          case 60: break;
          case 26:
            { return sym(MOD);
            }
            // fall through
          case 61: break;
          case 27:
            { return sym(VARIABLE);
            }
            // fall through
          case 62: break;
          case 28:
            { return sym(ELSE);
            }
            // fall through
          case 63: break;
          case 29:
            { return sym(FUNC);
            }
            // fall through
          case 64: break;
          case 30:
            { return sym(TRUE);
            }
            // fall through
          case 65: break;
          case 31:
            { return sym(FALSE);
            }
            // fall through
          case 66: break;
          case 32:
            { return sym(WHILE);
            }
            // fall through
          case 67: break;
          case 33:
            { return sym(RETURN);
            }
            // fall through
          case 68: break;
          case 34:
            { return sym(PRINT);
            }
            // fall through
          case 69: break;
          case 35:
            { return sym(GT);
            }
            // fall through
          case 70: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}