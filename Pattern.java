class Pattern{
    public static void main(String[] args){
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println("");
        }

        for(int i=0;i<=4;i++){
            for(int j=4;j>=0;j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        for(int i=1;i<=5;i++){
            int k=1;
            for(int j=5;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(k++);
                }
            }
            System.out.println("");
        }

        for(int i=1;i<=5;i++){
            int k=0;
            for(int j=5;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print((char)(65+(k++)));
                }
            }
            System.out.println("");
        }

        for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j-i+1);
                }
            }
            System.out.println("");
        }

        int k=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.print(++k);
            }
            System.out.println("");
        }

    }

}