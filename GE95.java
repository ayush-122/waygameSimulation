//package GoldenEagle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class GE95 {

    static Random random= new Random();
    static BigDecimal total_Win= BigDecimal.ZERO;
    static BigDecimal Free_Win=BigDecimal.ZERO;
    static BigDecimal Respin_Win=BigDecimal.ZERO;
    static BigDecimal Total_Free_Win = BigDecimal.ZERO;
    static BigDecimal Total_reSpin_Win = BigDecimal.ZERO;

    static BigDecimal Total_Base_Win=BigDecimal.ZERO;
    static BigDecimal Base_Win=BigDecimal.ZERO;
    static double sc3hits = 0;
    static double bnsHit = 0;

    public static void printMatrix (String[][] matrix){

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static String[][]  BaseMatrix(){
        String[][] matirx=new String[3][5];

        String[] reel1 = {"SC","L1","L4","H2","L3","L1","L1","L2","H2","L4","L2","L3","H4","L2","H3","H5","L4","L3","H1","L2","L3","L3","L4","L3","L3","H4","SC","L2","L4","L2","L3","L5","L4","L5","L5","SC","L1","L1","L5","L5","L2","H5","L1","L1","L5","L5","L3","L3","L3","L3","L3","L3","L3","L3","L3","L3","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L3","L5","L3","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L3","L5","L4","L3","L3"};;
        String[] reel2 = {"H2","L3","L1","H4","L2","WC","L4","H4","L1","BO","L2","L3","L2","WC","L1","L3","H1","L1","L3","BO","L3","H3","H4","L1","SC","H3","L3","H3","SC","H1","L1","L2","L3","SC","H2","H4","L2","L3","L4","H3","L2","SC","H5","L5","H5","H5","L5","L2","L5","H5","L1","L1","BO","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2","L2"};;
        String[] reel3 = {"L4","L1","H1","BO","H3","L4","BO","H5","L3","L2","L1","H4","L4","L1","H5","H1","L3","L4","H5","L1","H3","WC","L4","H4","H3","L4","L1","H3","BO","L1","H3","SC","H2","H4","H4","L2","L1","SC","H3","H4","H2","WC","H5","L5","H5","L5","BO","L5","L5","L5","L5","L5","H5","H1","L1","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4","L4"};;
        String[] reel4 = {"L3","L4","H3","H4","H1","L3","WC","L1","H2","H4","L3","L2","H3","BO","L1","L4","H1","H3","L1","BO","L1","H2","L2","L4","H4","L3","L2","H4","H3","L2","SC","L4","L2","L1","H4","H1","L1","WC","H2","H3","SC","L1","H4","H3","L2","L3","H4","L3","BO","H5","L5","L5","L5","L5","BO","L3","H5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5"};;
        String[] reel5 = {"L2","H3","L1","L3","L2","H4","WC","H2","L1","L2","L4","SC","H2","L1","H1","L3","WC","H3","H2","L1","WC","L4","L3","H1","H2","L4","L3","L1","L2","H3","H4","L4","L2","H3","L3","H1","H2","H3","L2","H4","L3","L4","H1","H4","L1","H1","H2","H4","L4","H1","L3","L2","L4","H2","H4","SC","H5","L5","H5","L3","H5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5","L5"};;

        int num1 = random.nextInt(reel1.length);
        int num2 = random.nextInt(reel2.length);
        int num3 = random.nextInt(reel3.length);
        int num4 = random.nextInt(reel4.length);
        int num5 = random.nextInt(reel5.length);

        matirx[0][0] = reel1[num1];
        matirx[0][1] = reel2[num2];
        matirx[0][2] = reel3[num3];
        matirx[0][3] = reel4[num4];
        matirx[0][4] = reel5[num5];

        matirx[1][0] = reel1[(num1 + 1) % reel1.length];
        matirx[1][1] = reel2[(num2 + 1) % reel2.length];
        matirx[1][2] = reel3[(num3 + 1) % reel3.length];
        matirx[1][3] = reel4[(num4 + 1) % reel4.length];
        matirx[1][4] = reel5[(num5 + 1) % reel5.length];

        matirx[2][0] = reel1[(num1 + 2) % reel1.length];
        matirx[2][1] = reel2[(num2 + 2) % reel2.length];
        matirx[2][2] = reel3[(num3 + 2) % reel3.length];
        matirx[2][3] = reel4[(num4 + 2) % reel4.length];
        matirx[2][4] = reel5[(num5 + 2) % reel5.length];

        return matirx;
    }

    public static String[][]  ReSpinMatrix(){
        String[][] matirx=new String[3][5];

        String[] reel1 = {"H3","L1","L4","H2","H1","L1","H1","L2","L3","H1","H2","L2","H5","L2","H2","L4","L2","H4","H1","L2","H2","L5","L3","H2","H2","L4","L5","H1","L5","H1","L5","H1","L5","H4","L5","L5","H1","H1","H2","H3","H1","H3","H4","H1","H1","H2","H2"};
        String[] reel2 = {"WC","L3","H1","H2","L2","WC","L4","H1","L1","H2","L4","H3","H2","L3","H1","H1","H2","H4","H5","L5","H3","H2","L3","H3","L3","H1","H2","H2","H1","L5","H2","L5","L5","WC","L5","L5","H1","H2","H2","H1","H2","H1","H3","H1"};
        String[] reel3 = {"L4","H1","L2","H3","L4","WC","H5","L3","WC","L2","L1","H3","L4","WC","L3","L4","H5","H3","WC","H4","H3","H1","WC","L3","H3","H4","H1","L4","WC","L5","H1","H2","H1","H2","H1","H1","H2","H1","H1","H2","H2","H1"};
        String[] reel4 = {"H5","L4","H4","L3","L1","WC","H2","L3","WC","L2","H2","L1","L3","H3","H2","L1","L4","L2","H1","L5","WC","L2","H4","H1","L1","H2","H1","L1","H3","L4","L1","WC","H2","H3","L2","H2","H1","H2","H1","H1"};
        String[] reel5 = {"H2","L2","H3","H1","L3","WC","L2","L1","L2","L4","H2","L1","L3","L1","WC","L3","H1","H2","H2","H3","L2","H3","L3","H2","WC","H4","L3","H1","H1","WC","H1","H2","L4","H1","L3","L2","H4","L5","H5","L5","L5","H1","WC","H5","H1"};

        int num1 = random.nextInt(reel1.length);
        int num2 = random.nextInt(reel2.length);
        int num3 = random.nextInt(reel3.length);
        int num4 = random.nextInt(reel4.length);
        int num5 = random.nextInt(reel5.length);

        matirx[0][0] = reel1[num1];
        matirx[0][1] = reel2[num2];
        matirx[0][2] = reel3[num3];
        matirx[0][3] = reel4[num4];
        matirx[0][4] = reel5[num5];

        matirx[1][0] = reel1[(num1 + 1) % reel1.length];
        matirx[1][1] = reel2[(num2 + 1) % reel2.length];
        matirx[1][2] = reel3[(num3 + 1) % reel3.length];
        matirx[1][3] = reel4[(num4 + 1) % reel4.length];
        matirx[1][4] = reel5[(num5 + 1) % reel5.length];

        matirx[2][0] = reel1[(num1 + 2) % reel1.length];
        matirx[2][1] = reel2[(num2 + 2) % reel2.length];
        matirx[2][2] = reel3[(num3 + 2) % reel3.length];
        matirx[2][3] = reel4[(num4 + 2) % reel4.length];
        matirx[2][4] = reel5[(num5 + 2) % reel5.length];

        return matirx;
    }
    public static String[][]  FreeMatrix(){
        String[][] matirx=new String[3][5];

        String[] reel1 = {"H3","L1","L4","H2","L1","L1","H1","L2","L3","L1","H2","L2","H5","L2","H2","L4","L2","H4","L1","L2","H2","L5","L3","L4","H2","L4","L5","H1","L5","H1","L5","H1","L5","H4","L5","L5","H1","H1","H2","H3","H1","H3"};
        String[] reel2 = {"WC","L3","L1","H2","L2","WC","L4","H1","L1","H2","L4","H3","L1","L3","H1","H1","H2","H4","H5","L5","H3","H2","L3","H3","L3","H1","H2","H2","H1","L5","H2","L5","L5","WC","L5","L5","H1"};
        String[] reel3 = {"L4","L1","L2","H3","L4","WC","H5","L3","WC","L2","L1","L1","L4","WC","L3","L4","H5","H3","WC","H4","H3","H1","WC","L3","H3","H4","H1","L4","WC","L5","L1","H2"};
        String[] reel4 = {"H5","L4","H4","L3","L1","WC","H2","L3","WC","L2","H2","L1","L3","H3","H2","L1","L4","L2","H1","L5","WC","L2","H4","H1","L1","H2","H1","L1","H3","L4","L1","WC","H2","H3","L2","H2","H1","L5"};
        String[] reel5 = {"L1","L2","H3","L1","L3","WC","L2","L1","L2","L4","H2","L1","L3","L1","WC","L3","L4","L3","L1","H3","L2","H3","L3","H2","WC","H4","L3","L4","H1","WC","H1","H2","L4","H1","L3","L2","H4","L5","H5","L5","L5","L5","WC","H5"};

        int num1 = random.nextInt(reel1.length);
        int num2 = random.nextInt(reel2.length);
        int num3 = random.nextInt(reel3.length);
        int num4 = random.nextInt(reel4.length);
        int num5 = random.nextInt(reel5.length);

        matirx[0][0] = reel1[num1];
        matirx[0][1] = reel2[num2];
        matirx[0][2] = reel3[num3];
        matirx[0][3] = reel4[num4];
        matirx[0][4] = reel5[num5];

        matirx[1][0] = reel1[(num1 + 1) % reel1.length];
        matirx[1][1] = reel2[(num2 + 1) % reel2.length];
        matirx[1][2] = reel3[(num3 + 1) % reel3.length];
        matirx[1][3] = reel4[(num4 + 1) % reel4.length];
        matirx[1][4] = reel5[(num5 + 1) % reel5.length];

        matirx[2][0] = reel1[(num1 + 2) % reel1.length];
        matirx[2][1] = reel2[(num2 + 2) % reel2.length];
        matirx[2][2] = reel3[(num3 + 2) % reel3.length];
        matirx[2][3] = reel4[(num4 + 2) % reel4.length];
        matirx[2][4] = reel5[(num5 + 2) % reel5.length];



        return matirx;
    }

    public static int win_fun(String[][] matrix){
        int final_win=0;

        String all_symbol[] = {"WC",      "H1",      "H2",      "H3",      "H4",      "H5",   "L1",   "L2",   "L3",  "L4",    "L5",   "SC",   "BO"};
        int[] pay_5 =         { 0,         600,       375,       225,       150,       150,    150,     120,    90,    60,      45,     0,      0};
        int[] pay_4 =         { 0,         300,       200,       150,       120,       100,    100,     75,     45,    30,      30,     0,      0};
        int[] pay_3 =         { 0,         180,       150,       100,        75,        50,     50,     35,     20,    20,      20,     0,      0};

        String FirstSymbol  = matrix[0][0];
        String SecondSymbol = matrix[1][0];
        String ThirdSymbol  = matrix[2][0];
//        String FourthSymbol = matrix[3][0];

        int[] ColumnCount_1= new int[5];
        int[] ColumnCount_2= new int[5];
        int[] ColumnCount_3= new int[5];
//        int[] ColumnCount_4= new int[5];



        for(int i=0; i<5; i++){
            int FirstSymbolCount=0; int SecondSymbolCount=0;  int ThirdSymbolCount=0;

            for(int j=0; j<3; j++){
                if(matrix[j][i]==FirstSymbol  || matrix[j][i]=="WC") {FirstSymbolCount++  ; ColumnCount_1[i]=FirstSymbolCount;   };
                if(matrix[j][i]==SecondSymbol || matrix[j][i]=="WC") {SecondSymbolCount++ ; ColumnCount_2[i]=SecondSymbolCount;  };
                if(matrix[j][i]==ThirdSymbol  || matrix[j][i]=="WC") {ThirdSymbolCount++  ; ColumnCount_3[i]=ThirdSymbolCount;   };
//                if(matrix[j][i]==FourthSymbol || matrix[j][i]=="WC") {FourthSymbolCount++ ; ColumnCount_4[i]=FourthSymbolCount;  };
            }
        }

        int product1=1; int product2=1; int product3=1;
        int count_1=0;  int count_2=0;  int count_3=0;

        for( int i=0; i<5;i++){
            if(ColumnCount_1[i]!=0) {
                product1*=ColumnCount_1[i];
                count_1++; }
            else break;
        }

        for( int i=0; i<5;i++){
            if(ColumnCount_2[i]!=0) {
                product2*=ColumnCount_2[i];
                count_2++; }
            else break;
        }

        for( int i=0; i<5;i++){
            if(ColumnCount_3[i]!=0) {
                product3*=ColumnCount_3[i];
                count_3++; }
            else break;
        }

        if(FirstSymbol  == SecondSymbol || FirstSymbol  == ThirdSymbol  ) product1=0;
        if(SecondSymbol == ThirdSymbol) product2=0;


        if(count_1>=3 || count_2>=3 || count_3>=3   ){

            for(int i=0; i<all_symbol.length; i++){

                if(all_symbol[i]==FirstSymbol){
                    if(count_1==3){ final_win+= (pay_3[i]*product1); }
                    if(count_1==4){ final_win+= (pay_4[i]*product1); }
                    if(count_1==5){ final_win+= (pay_5[i]*product1); }
                }
                if(all_symbol[i]==SecondSymbol){
                    if(count_2==3){ final_win += (pay_3[i]*product2); }
                    if(count_2==4){ final_win += (pay_4[i]*product2); }
                    if(count_2==5){ final_win += (pay_5[i]*product2); }
                }
                if(all_symbol[i]==ThirdSymbol){
                    if(count_3==3){ final_win += (pay_3[i]*product3); }
                    if(count_3==4){ final_win += (pay_4[i]*product3); }
                    if(count_3==5){ final_win += (pay_5[i]*product3); }
                }
            }
//            int wildCount= 1;
//            if(wildCount>1) final_win*=wildCount;
        }
        return final_win;
    }

    public static int scatterCount(String[][] matrix){

        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == "SC") count ++;
            }
        }
        return count;
    }

    public static int bonusCount(String[][] matrix){

        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == "BO") count ++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        int bet = 30;
        BigDecimal total_bet=BigDecimal.ZERO;
        BigDecimal Base_Rtp= BigDecimal.ZERO;
        BigDecimal reSpin_Rtp= BigDecimal.ZERO;
        BigDecimal Free_Rtp= BigDecimal.ZERO;
        BigDecimal Total_Rtp= BigDecimal.ZERO;

        for(int i=0; i<=1000000000; i++){

            total_bet=total_bet.add(BigDecimal.valueOf(bet));
            String[][] Base_matrix= BaseMatrix();
           // printMatrix(Base_matrix);
            Base_Win=BigDecimal.valueOf(win_fun(Base_matrix));
            Total_Base_Win=Total_Base_Win.add(Base_Win);
            total_Win=total_Win.add(Base_Win);
            int bnscnt = bonusCount(Base_matrix);

            //======================================================== ReSpin Start ======================================================================================
            if(bnscnt>=3) {
                bnsHit++;
                int reSpin = 0;
                if     (bnscnt == 3) reSpin = 5;
                else if(bnscnt == 4) reSpin = 8;
                else if(bnscnt == 5) reSpin = 12;

                for(int j=0; j<reSpin; j++){
                    String[][] reSpin_matrix= ReSpinMatrix();
                    Respin_Win = BigDecimal.valueOf(win_fun(reSpin_matrix));
//                System.out.println("=="+ Free_Win);
                    Total_reSpin_Win = Total_reSpin_Win.add(Respin_Win);
                    total_Win = total_Win.add(Respin_Win);
                }

            }

            //========================================================= Free Game start ===================================================================================
            int scattrCnt = scatterCount(Base_matrix);
            int free_Spins =0;
            if(scattrCnt>=3) sc3hits++;
            if      (scattrCnt == 3) free_Spins = 5;
            else if (scattrCnt == 4) free_Spins = 8;
            else if (scattrCnt == 5) free_Spins = 12;

            for(int j=0; j<free_Spins; j++){
                String[][] free_matrix= FreeMatrix();
                Free_Win = BigDecimal.valueOf(win_fun(free_matrix));
//                System.out.println("=="+ Free_Win);
                Total_Free_Win = Total_Free_Win.add(Free_Win);
                total_Win=total_Win.add(Free_Win);
            }

            //========================================================= Free Game end ===================================================================================

            if(i%10000000==0){
                Total_Rtp = total_Win.divide(total_bet, 8, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
                Base_Rtp = Total_Base_Win.divide(total_bet, 8, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
                reSpin_Rtp = Total_reSpin_Win.divide(total_bet, 8, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
                Free_Rtp = Total_Free_Win.divide(total_bet, 8, RoundingMode.CEILING).multiply(BigDecimal.valueOf(100));
                System.out.println("GE95 cycle is:- "+i+"; Total rtp is:-"+Total_Rtp+ ", base rtp:- "+Base_Rtp+" ReSpin RTP:- "+reSpin_Rtp+"; Free game rtp is:- "+Free_Rtp );
                if(sc3hits != 0) System.out.println("scatter hits    " + i / sc3hits);
                if(bnsHit != 0) System.out.println("total bonus hits    " + i / bnsHit);
            }
        }
    }
}

//        GE95 cycle is:- 998000000; Total rtp is:-95.68778800, base rtp:- 45.47244600 ReSpin RTP:- 23.00847900; Free game rtp is:- 27.20686400
//        scatter hits    150.4559433188139
//        total bonus hits    430.4239891936839
//        GE95 cycle is:- 999000000; Total rtp is:-95.68740400, base rtp:- 45.47265900 ReSpin RTP:- 23.00835700; Free game rtp is:- 27.20638900
//        scatter hits    150.46034993251877
//        total bonus hits    430.42589759310493
//        GE95 cycle is:- 1000000000; Total rtp is:-95.68622200, base rtp:- 45.47265000 ReSpin RTP:- 23.00736300; Free game rtp is:- 27.20621100
//        scatter hits    150.46148795277435
//        total bonus hits    430.438918565261