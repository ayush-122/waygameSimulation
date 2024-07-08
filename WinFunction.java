import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class WinFunction{ 
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
            System.out.println("First Symbol Count "+FirstSymbolCount);
            System.out.println("second Symbol Count "+SecondSymbolCount);
            System.out.println("third Symbol Count "+ThirdSymbolCount);
                        
           
           


        }
         //column1 count
        for (int i=0;i<5;i++)
            System.out.print(ColumnCount_1[i]);
        System.out.println();
        for (int i=0;i<5;i++)
        System.out.print(ColumnCount_2[i]);
    System.out.println();
    for (int i=0;i<5;i++)
    System.out.print(ColumnCount_3[i]);
System.out.println();

    
        
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

    public static void main(String[] args) {

         String Base_matrix[][]= {
            {"L3", "H5", "H4", "L5", "L1"},
            {"L3", "H5", "L4", "L5", "L2"},
            {"H5", "H5", "H5", "H5", "H5"},
         };
        BigDecimal Base_Win=BigDecimal.valueOf(win_fun(Base_matrix));
        System.out.println(Base_Win);
        
    }
}