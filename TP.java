package datamining;

import java.util.LinkedList;

public class TP {

    public static int Racine;
    public static int NombreVariable;
    public static LinkedList variables;
    public static String Tree;

    public TP() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static boolean trouveElem(LinkedList list, int n) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: iload_2
         * 3: aload_0
         * 4: invokevirtual java/util/LinkedList.size:()I
         * 7: if_icmpge     33
         * 10: aload_0
         * 11: iload_2
         * 12: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 15: checkcast     java/lang/Integer
         * 18: invokevirtual java/lang/Integer.intValue:()I
         * 21: iload_1
         * 22: if_icmpne     27
         * 25: iconst_1
         * 26: ireturn
         * 27: iinc          2, 1
         * 30: goto          2
         * 33: iconst_0
         * 34: ireturn
         *  */
        // </editor-fold>
    }

    public static int Occurence(LinkedList list, String nom) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: iconst_0
         * 3: istore_3
         * 4: iload_3
         * 5: aload_0
         * 6: invokevirtual java/util/LinkedList.size:()I
         * 9: if_icmpge     33
         * 12: aload_0
         * 13: iload_3
         * 14: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 17: aload_1
         * 18: invokevirtual java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 21: ifeq          27
         * 24: iinc          2, 1
         * 27: iinc          3, 1
         * 30: goto          4
         * 33: iload_2
         * 34: ireturn
         *  */
        // </editor-fold>
    }

    public static boolean ExistListe(LinkedList list, String nom) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           datamining/Cas
         * 3: dup
         * 4: invokespecial datamining/Cas."<init>":()V
         * 7: astore_2
         * 8: iconst_0
         * 9: istore_3
         * 10: iload_3
         * 11: aload_0
         * 12: invokevirtual java/util/LinkedList.size:()I
         * 15: if_icmpge     46
         * 18: aload_0
         * 19: iload_3
         * 20: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 23: checkcast     datamining/Cas
         * 26: astore_2
         * 27: aload_2
         * 28: invokevirtual datamining/Cas.getNom:()Ljava/lang/String;
         * 31: aload_1
         * 32: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 35: ifeq          40
         * 38: iconst_1
         * 39: ireturn
         * 40: iinc          3, 1
         * 43: goto          10
         * 46: iconst_0
         * 47: ireturn
         *  */
        // </editor-fold>
    }

    public static LinkedList OccuVar(LinkedList<LinkedList> m, int var) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/util/LinkedList
         * 3: dup
         * 4: invokespecial java/util/LinkedList."<init>":()V
         * 7: astore_2
         * 8: new           java/util/LinkedList
         * 11: dup
         * 12: invokespecial java/util/LinkedList."<init>":()V
         * 15: astore_3
         * 16: iconst_0
         * 17: istore        4
         * 19: iload         4
         * 21: aload_0
         * 22: invokevirtual java/util/LinkedList.size:()I
         * 25: if_icmpge     52
         * 28: aload_3
         * 29: aload_0
         * 30: iload         4
         * 32: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 35: checkcast     java/util/LinkedList
         * 38: iload_1
         * 39: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 42: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 45: pop
         * 46: iinc          4, 1
         * 49: goto          19
         * 52: iconst_0
         * 53: istore        4
         * 55: iload         4
         * 57: aload_3
         * 58: invokevirtual java/util/LinkedList.size:()I
         * 61: if_icmpge     130
         * 64: aload_2
         * 65: aload_3
         * 66: iload         4
         * 68: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 71: checkcast     java/lang/String
         * 74: invokestatic  datamining/TP.ExistListe:(Ljava/util/LinkedList;Ljava/lang/String;)Z
         * 77: ifne          124
         * 80: new           datamining/Cas
         * 83: dup
         * 84: invokespecial datamining/Cas."<init>":()V
         * 87: astore        5
         * 89: aload         5
         * 91: aload_3
         * 92: iload         4
         * 94: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 97: checkcast     java/lang/String
         * 100: invokevirtual datamining/Cas.setNom:(Ljava/lang/String;)V
         * 103: aload         5
         * 105: aload_3
         * 106: aload         5
         * 108: invokevirtual datamining/Cas.getNom:()Ljava/lang/String;
         * 111: invokestatic  datamining/TP.Occurence:(Ljava/util/LinkedList;Ljava/lang/String;)I
         * 114: invokevirtual datamining/Cas.setOccurence:(I)V
         * 117: aload_2
         * 118: aload         5
         * 120: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 123: pop
         * 124: iinc          4, 1
         * 127: goto          55
         * 130: aload_2
         * 131: areturn
         *  */
        // </editor-fold>
    }

    public static LinkedList<LinkedList> ligneCondition(LinkedList<LinkedList> m, LinkedList c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/util/LinkedList
         * 3: dup
         * 4: invokespecial java/util/LinkedList."<init>":()V
         * 7: astore_2
         * 8: iconst_0
         * 9: istore_3
         * 10: iload_3
         * 11: aload_0
         * 12: invokevirtual java/util/LinkedList.size:()I
         * 15: if_icmpge     102
         * 18: aload_0
         * 19: iload_3
         * 20: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 23: checkcast     java/util/LinkedList
         * 26: astore        4
         * 28: iconst_0
         * 29: istore        5
         * 31: iconst_0
         * 32: istore        6
         * 34: iload         6
         * 36: aload_1
         * 37: invokevirtual java/util/LinkedList.size:()I
         * 40: if_icmpge     84
         * 43: aload_1
         * 44: iload         6
         * 46: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 49: checkcast     datamining/Condition
         * 52: astore        7
         * 54: aload         4
         * 56: aload         7
         * 58: invokevirtual datamining/Condition.getColumn:()I
         * 61: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 64: aload         7
         * 66: invokevirtual datamining/Condition.getNom:()Ljava/lang/String;
         * 69: invokevirtual java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 72: ifne          78
         * 75: iinc          5, 1
         * 78: iinc          6, 1
         * 81: goto          34
         * 84: iload         5
         * 86: ifne          96
         * 89: aload_2
         * 90: aload         4
         * 92: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 95: pop
         * 96: iinc          3, 1
         * 99: goto          10
         * 102: aload_2
         * 103: areturn
         *  */
        // </editor-fold>
    }

    public static LinkedList<LinkedList> LireFichier(String nom) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: astore_1
         * 2: new           java/util/LinkedList
         * 5: dup
         * 6: invokespecial java/util/LinkedList."<init>":()V
         * 9: astore_2
         * 10: new           java/io/FileReader
         * 13: dup
         * 14: aload_1
         * 15: invokespecial java/io/FileReader."<init>":(Ljava/lang/String;)V
         * 18: astore_3
         * 19: new           java/io/BufferedReader
         * 22: dup
         * 23: aload_3
         * 24: invokespecial java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
         * 27: astore        4
         * 29: new           java/lang/String
         * 32: dup
         * 33: invokespecial java/lang/String."<init>":()V
         * 36: astore        5
         * 38: aload         4
         * 40: invokevirtual java/io/BufferedReader.readLine:()Ljava/lang/String;
         * 43: dup
         * 44: astore        5
         * 46: ifnull        103
         * 49: new           java/util/LinkedList
         * 52: dup
         * 53: invokespecial java/util/LinkedList."<init>":()V
         * 56: astore        6
         * 58: new           java/util/StringTokenizer
         * 61: dup
         * 62: aload         5
         * 64: ldc
         * 66: invokespecial java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
         * 69: astore        7
         * 71: aload         7
         * 73: invokevirtual java/util/StringTokenizer.hasMoreElements:()Z
         * 76: ifeq          93
         * 79: aload         6
         * 81: aload         7
         * 83: invokevirtual java/util/StringTokenizer.nextToken:()Ljava/lang/String;
         * 86: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 89: pop
         * 90: goto          71
         * 93: aload_2
         * 94: aload         6
         * 96: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 99: pop
         * 100: goto          38
         * 103: aload_2
         * 104: areturn
         * 105: astore_3
         * 106: getstatic     java/lang/System.out:Ljava/io/PrintStream;
         * 109: new           java/lang/StringBuilder
         * 112: dup
         * 113: invokespecial java/lang/StringBuilder."<init>":()V
         * 116: ldc           erreur :
         * 118: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 121: aload_3
         * 122: invokevirtual java/lang/Exception.getMessage:()Ljava/lang/String;
         * 125: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 128: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 131: invokevirtual java/io/PrintStream.println:(Ljava/lang/String;)V
         * 134: aconst_null
         * 135: areturn
         * Exception table:
         * from    to  target type
         * 10   104   105   Class java/lang/Exception
         *  */
        // </editor-fold>
    }

    public static double carre(double d) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: dload_0
         * 1: dload_0
         * 2: dmul
         * 3: dreturn
         *  */
        // </editor-fold>
    }

    public static LinkedList IRacine(LinkedList<LinkedList> m, LinkedList Racine) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: iconst_1
         * 3: istore_3
         * 4: iload_3
         * 5: aload_0
         * 6: invokevirtual java/util/LinkedList.size:()I
         * 9: if_icmpge     44
         * 12: aload_0
         * 13: iload_3
         * 14: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 17: checkcast     java/util/LinkedList
         * 20: iconst_4
         * 21: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 24: aload_1
         * 25: iconst_1
         * 26: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 29: invokevirtual java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 32: ifeq          38
         * 35: iinc          2, 1
         * 38: iinc          3, 1
         * 41: goto          4
         * 44: new           java/util/LinkedList
         * 47: dup
         * 48: invokespecial java/util/LinkedList."<init>":()V
         * 51: astore_3
         * 52: dconst_0
         * 53: aload_0
         * 54: invokevirtual java/util/LinkedList.size:()I
         * 57: i2d
         * 58: dadd
         * 59: dconst_1
         * 60: dsub
         * 61: dstore        4
         * 63: aload_3
         * 64: dload         4
         * 66: invokestatic  java/lang/Double.valueOf:(D)Ljava/lang/Double;
         * 69: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 72: pop
         * 73: aload_3
         * 74: dconst_0
         * 75: iload_2
         * 76: i2d
         * 77: dadd
         * 78: dconst_0
         * 79: dload         4
         * 81: dadd
         * 82: iload_2
         * 83: i2d
         * 84: dsub
         * 85: invokestatic  datamining/TP.I:(DD)D
         * 88: invokestatic  java/lang/Double.valueOf:(D)Ljava/lang/Double;
         * 91: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 94: pop
         * 95: aload_3
         * 96: areturn
         *  */
        // </editor-fold>
    }

    public static LinkedList ConditionLigne(LinkedList<LinkedList> m, LinkedList conditions) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/util/LinkedList
         * 3: dup
         * 4: invokespecial java/util/LinkedList."<init>":()V
         * 7: astore_2
         * 8: iconst_1
         * 9: istore_3
         * 10: new           datamining/Condition
         * 13: dup
         * 14: invokespecial datamining/Condition."<init>":()V
         * 17: astore        4
         * 19: iconst_0
         * 20: istore        5
         * 22: iload         5
         * 24: aload_0
         * 25: invokevirtual java/util/LinkedList.size:()I
         * 28: if_icmpge     114
         * 31: iconst_1
         * 32: istore_3
         * 33: iconst_0
         * 34: istore        6
         * 36: iload         6
         * 38: aload_1
         * 39: invokevirtual java/util/LinkedList.size:()I
         * 42: if_icmpge     92
         * 45: aload_1
         * 46: iload         6
         * 48: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 51: checkcast     datamining/Condition
         * 54: astore        4
         * 56: aload_0
         * 57: iload         5
         * 59: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 62: checkcast     java/util/LinkedList
         * 65: aload         4
         * 67: invokevirtual datamining/Condition.getColumn:()I
         * 70: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 73: aload         4
         * 75: invokevirtual datamining/Condition.getNom:()Ljava/lang/String;
         * 78: invokevirtual java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 81: ifne          86
         * 84: iconst_0
         * 85: istore_3
         * 86: iinc          6, 1
         * 89: goto          36
         * 92: iload_3
         * 93: iconst_1
         * 94: if_icmpne     108
         * 97: aload_2
         * 98: aload_0
         * 99: iload         5
         * 101: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 104: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 107: pop
         * 108: iinc          5, 1
         * 111: goto          22
         * 114: aload_2
         * 115: areturn
         *  */
        // </editor-fold>
    }

    public static double IGinie(LinkedList<LinkedList> m, LinkedList conditions, int var) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: dconst_0
         * 1: dstore_3
         * 2: aload_0
         * 3: aload_1
         * 4: invokestatic  datamining/TP.ConditionLigne:(Ljava/util/LinkedList;Ljava/util/LinkedList;)Ljava/util/LinkedList;
         * 7: astore        5
         * 9: new           java/util/LinkedList
         * 12: dup
         * 13: invokespecial java/util/LinkedList."<init>":()V
         * 16: astore        6
         * 18: aload         5
         * 20: iload_2
         * 21: invokestatic  datamining/TP.OccuVar:(Ljava/util/LinkedList;I)Ljava/util/LinkedList;
         * 24: astore        6
         * 26: new           datamining/Cas
         * 29: dup
         * 30: invokespecial datamining/Cas."<init>":()V
         * 33: astore        7
         * 35: iconst_0
         * 36: istore        8
         * 38: iload         8
         * 40: aload         6
         * 42: invokevirtual java/util/LinkedList.size:()I
         * 45: if_icmpge     85
         * 48: aload         6
         * 50: iload         8
         * 52: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 55: checkcast     datamining/Cas
         * 58: astore        7
         * 60: dload_3
         * 61: aload         7
         * 63: invokevirtual datamining/Cas.getOccurence:()I
         * 66: i2d
         * 67: aload         5
         * 69: invokevirtual java/util/LinkedList.size:()I
         * 72: i2d
         * 73: ddiv
         * 74: invokestatic  datamining/TP.carre:(D)D
         * 77: dadd
         * 78: dstore_3
         * 79: iinc          8, 1
         * 82: goto          38
         * 85: dconst_1
         * 86: dload_3
         * 87: dsub
         * 88: dreturn
         *  */
        // </editor-fold>
    }

    public static double I(double x, double y) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: dconst_0
         * 1: dload_0
         * 2: dadd
         * 3: dload_2
         * 4: dadd
         * 5: dstore        4
         * 7: dconst_1
         * 8: dload_0
         * 9: dload         4
         * 11: ddiv
         * 12: invokestatic  datamining/TP.carre:(D)D
         * 15: dload_2
         * 16: dload         4
         * 18: ddiv
         * 19: invokestatic  datamining/TP.carre:(D)D
         * 22: dadd
         * 23: dsub
         * 24: dstore        6
         * 26: dload         6
         * 28: dreturn
         *  */
        // </editor-fold>
    }

    public static double Gain(LinkedList<LinkedList> m, LinkedList conditions, double IGinie, int Racine, int var) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/util/LinkedList
         * 3: dup
         * 4: invokespecial java/util/LinkedList."<init>":()V
         * 7: astore        6
         * 9: dconst_0
         * 10: dstore        7
         * 12: dconst_0
         * 13: dstore        9
         * 15: aload_0
         * 16: aload_1
         * 17: invokestatic  datamining/TP.ligneCondition:(Ljava/util/LinkedList;Ljava/util/LinkedList;)Ljava/util/LinkedList;
         * 20: astore        6
         * 22: aload_0
         * 23: iload         5
         * 25: invokestatic  datamining/TP.OccuVar:(Ljava/util/LinkedList;I)Ljava/util/LinkedList;
         * 28: astore        11
         * 30: iconst_0
         * 31: istore        12
         * 33: iload         12
         * 35: aload         11
         * 37: invokevirtual java/util/LinkedList.size:()I
         * 40: if_icmpge     141
         * 43: new           datamining/Condition
         * 46: dup
         * 47: invokespecial datamining/Condition."<init>":()V
         * 50: astore        13
         * 52: aload         11
         * 54: iload         12
         * 56: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 59: checkcast     datamining/Cas
         * 62: astore        14
         * 64: aload         13
         * 66: iload         5
         * 68: invokevirtual datamining/Condition.setColumn:(I)V
         * 71: aload         13
         * 73: aload         14
         * 75: invokevirtual datamining/Cas.getNom:()Ljava/lang/String;
         * 78: invokevirtual datamining/Condition.setNom:(Ljava/lang/String;)V
         * 81: aload_1
         * 82: aload         13
         * 84: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 87: pop
         * 88: dload         9
         * 90: aload_0
         * 91: aload_1
         * 92: iload         4
         * 94: invokestatic  datamining/TP.IGinie:(Ljava/util/LinkedList;Ljava/util/LinkedList;I)D
         * 97: aload         14
         * 99: invokevirtual datamining/Cas.getOccurence:()I
         * 102: i2d
         * 103: aload         6
         * 105: invokevirtual java/util/LinkedList.size:()I
         * 108: i2d
         * 109: ddiv
         * 110: dmul
         * 111: dadd
         * 112: dstore        9
         * 114: aload_1
         * 115: aload_1
         * 116: aload_1
         * 117: invokevirtual java/util/LinkedList.size:()I
         * 120: iconst_1
         * 121: isub
         * 122: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 125: invokevirtual java/util/LinkedList.remove:(Ljava/lang/Object;)Z
         * 128: pop
         * 129: dload_2
         * 130: dload         9
         * 132: dsub
         * 133: dstore        7
         * 135: iinc          12, 1
         * 138: goto          33
         * 141: dload         7
         * 143: dreturn
         *  */
        // </editor-fold>
    }

    public static void BuiltTree(LinkedList<LinkedList> m, LinkedList conditions, int Noued, LinkedList VariableDeja) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: getstatic     datamining/TP.Racine:I
         * 5: invokestatic  datamining/TP.IGinie:(Ljava/util/LinkedList;Ljava/util/LinkedList;I)D
         * 8: dstore        4
         * 10: dload         4
         * 12: dconst_0
         * 13: dcmpl
         * 14: ifle          217
         * 17: aload_3
         * 18: invokevirtual java/util/LinkedList.size:()I
         * 21: getstatic     datamining/TP.NombreVariable:I
         * 24: if_icmpeq     217
         * 27: iconst_0
         * 28: istore        6
         * 30: dconst_0
         * 31: dstore        7
         * 33: iconst_0
         * 34: istore        9
         * 36: iload         9
         * 38: aload_0
         * 39: iconst_0
         * 40: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 43: checkcast     java/util/LinkedList
         * 46: invokevirtual java/util/LinkedList.size:()I
         * 49: if_icmpge     107
         * 52: aload_0
         * 53: aload_1
         * 54: dload         4
         * 56: getstatic     datamining/TP.Racine:I
         * 59: iload         9
         * 61: invokestatic  datamining/TP.Gain:(Ljava/util/LinkedList;Ljava/util/LinkedList;DII)D
         * 64: dstore        10
         * 66: dload         10
         * 68: dload         7
         * 70: dcmpl
         * 71: ifle          101
         * 74: aload_3
         * 75: iload         9
         * 77: invokestatic  datamining/TP.trouveElem:(Ljava/util/LinkedList;I)Z
         * 80: ifne          101
         * 83: aload_0
         * 84: aload_1
         * 85: dload         4
         * 87: getstatic     datamining/TP.Racine:I
         * 90: iload         9
         * 92: invokestatic  datamining/TP.Gain:(Ljava/util/LinkedList;Ljava/util/LinkedList;DII)D
         * 95: dstore        7
         * 97: iload         9
         * 99: istore        6
         * 101: iinc          9, 1
         * 104: goto          36
         * 107: aload_3
         * 108: iload         6
         * 110: invokestatic  java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         * 113: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 116: pop
         * 117: new           java/util/LinkedList
         * 120: dup
         * 121: invokespecial java/util/LinkedList."<init>":()V
         * 124: astore        9
         * 126: aload_0
         * 127: iload         6
         * 129: invokestatic  datamining/TP.OccuVar:(Ljava/util/LinkedList;I)Ljava/util/LinkedList;
         * 132: astore        9
         * 134: iconst_0
         * 135: istore        10
         * 137: iload         10
         * 139: aload         9
         * 141: invokevirtual java/util/LinkedList.size:()I
         * 144: if_icmpge     214
         * 147: new           datamining/Condition
         * 150: dup
         * 151: invokespecial datamining/Condition."<init>":()V
         * 154: astore        11
         * 156: aload         11
         * 158: iload         6
         * 160: invokevirtual datamining/Condition.setColumn:(I)V
         * 163: aload         11
         * 165: aload         9
         * 167: iload         10
         * 169: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 172: checkcast     datamining/Cas
         * 175: invokevirtual datamining/Cas.getNom:()Ljava/lang/String;
         * 178: invokevirtual datamining/Condition.setNom:(Ljava/lang/String;)V
         * 181: aload_1
         * 182: aload         11
         * 184: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 187: pop
         * 188: aload_0
         * 189: aload_1
         * 190: getstatic     datamining/TP.Racine:I
         * 193: aload_3
         * 194: invokestatic  datamining/TP.BuiltTree:(Ljava/util/LinkedList;Ljava/util/LinkedList;ILjava/util/LinkedList;)V
         * 197: aload_1
         * 198: aload_1
         * 199: invokevirtual java/util/LinkedList.size:()I
         * 202: iconst_1
         * 203: isub
         * 204: invokevirtual java/util/LinkedList.remove:(I)Ljava/lang/Object;
         * 207: pop
         * 208: iinc          10, 1
         * 211: goto          137
         * 214: goto          405
         * 217: ldc
         * 219: astore        6
         * 221: aload_0
         * 222: aload_1
         * 223: invokestatic  datamining/TP.ConditionLigne:(Ljava/util/LinkedList;Ljava/util/LinkedList;)Ljava/util/LinkedList;
         * 226: astore        7
         * 228: iconst_0
         * 229: istore        8
         * 231: iload         8
         * 233: aload_1
         * 234: invokevirtual java/util/LinkedList.size:()I
         * 237: if_icmpge     311
         * 240: aload_1
         * 241: iload         8
         * 243: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 246: checkcast     datamining/Condition
         * 249: astore        9
         * 251: new           java/lang/StringBuilder
         * 254: dup
         * 255: invokespecial java/lang/StringBuilder."<init>":()V
         * 258: aload         6
         * 260: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 263: ldc
         * 265: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 268: getstatic     datamining/TP.variables:Ljava/util/LinkedList;
         * 271: aload         9
         * 273: invokevirtual datamining/Condition.getColumn:()I
         * 276: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 279: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 282: ldc             :
         * 284: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 287: aload         9
         * 289: invokevirtual datamining/Condition.getNom:()Ljava/lang/String;
         * 292: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 295: ldc              --->
         * 297: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 300: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 303: astore        6
         * 305: iinc          8, 1
         * 308: goto          231
         * 311: new           java/lang/StringBuilder
         * 314: dup
         * 315: invokespecial java/lang/StringBuilder."<init>":()V
         * 318: aload         6
         * 320: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 323: ldc
         * 325: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 328: getstatic     datamining/TP.variables:Ljava/util/LinkedList;
         * 331: getstatic     datamining/TP.Racine:I
         * 334: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 337: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 340: ldc             :
         * 342: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 345: aload         7
         * 347: iconst_0
         * 348: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 351: checkcast     java/util/LinkedList
         * 354: getstatic     datamining/TP.Racine:I
         * 357: invokevirtual java/util/LinkedList.get:(I)Ljava/lang/Object;
         * 360: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 363: ldc            \n
         * 365: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 368: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 371: astore        6
         * 373: getstatic     java/lang/System.out:Ljava/io/PrintStream;
         * 376: aload         6
         * 378: invokevirtual java/io/PrintStream.println:(Ljava/lang/String;)V
         * 381: new           java/lang/StringBuilder
         * 384: dup
         * 385: invokespecial java/lang/StringBuilder."<init>":()V
         * 388: getstatic     datamining/TP.Tree:Ljava/lang/String;
         * 391: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 394: aload         6
         * 396: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 399: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 402: putstatic     datamining/TP.Tree:Ljava/lang/String;
         * 405: return
         *  */
        // </editor-fold>
    }
}
