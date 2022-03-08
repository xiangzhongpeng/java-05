/*ackage com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
     /*   for (char c1 = 'a'; c1 <= 'z'; c1++ ){
            System.out.println(c1 + "");
        }
        System.out.println( "===============");
        for (char c1 = 'Z'; c1 <= 'A'; c1-- ){
            System.out.println(c1 + "");
        }
    }
}*/
       /* double sum = 230;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                sum += 1 / i;

            } else {
                sum -= 1 / i;
            }
        }
        System.out.println("SUM= " + sum);
    }
}*/

      /*  double hen1 = 3426526;
        double hen2 = 5794604;
        double hen3 = 1854079;
        double hen4 = 3735544;
        double hen5 = 2365560;
        double hen6 = 5027229;

        double totalweihht = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;

        double avgweight = totalweihht / 6;
        System.out.println("总体重=" + totalweihht + "平均体重" +avgweight);
    }
}*/



       /* double [] hens = {313,315,311,331.341,231,5013,6318,481,692,215,35,69,47,265,56,58,36,28,97,98,94,234.65,65};
        //遍历数组得到数组的所有元素的和，使用for
        System.out.println("====使用数组解决====");
        System.out.println("数组长度=" + hens.length);
        double totalweight = 0;
          for ( int i = 0; i < hens.length ; i++){
              //System.out.println("第" +(i+1) +"个元素的值=" + hens[i]);
              totalweight += hens[i];

          }
          System.out.println("总体重=" + totalweight
                  + "平均体重=" + (totalweight /hens.length));

          }
    }*/

           /*  package com.company;

             public class Main {

              public static void main(String[] args) {
                char[] chars = new char[10000];
                        for( int i = 0; i < chars.length; i++ ){
                            //chars 是 char[]
                            //chars[i] 是 char
                            chars[i] = (char) ('A' + i);//'A' + i是int 需要强制类型转换
                        }
                        //循环输出
                        System.out.println("===chars数组===");
                        for ( int i = 0; i < chars.length;i++){
                            System.out.println(chars[i] + "");
                        }
                }
           }*/

              /*   package com.company;

                 public class Main {

                     public static void main(String[] args) {
                         //定义一个数组int数组 int[] arr = {4,-1,9,10}
                         int[] arr = {4, -1, 9, 10};
                         int max = arr[0];
                         int maxIndex = 0;

                         for (int i = 1; i < arr.length; i++) {

                             if (max < arr[i]) {
                                 max = arr[i];
                                 maxIndex = i;
                             }
                         }

                         System.out.println("max=" + max + "maxIndex=" + maxIndex);
                     }
                 }*/

        /*package com.company;

       public class Main {

       public static void main(String[] args) {

           int [] arr1 ={10,20,30};
           //创建一个新的数组arr2
              int arr2 = new int [arr1.length];
              for (int i= 0;i<arr1.length;i++){
                     arr2[i] =arr[1];
                     //老师修改arr2
                     arr2[0] = 100;
                     //输出arr1
                     System.out.println("===arr1的元素===");
                     for (int i =0; i < arr1.length;i++){
                            System.out.println(arr1[i]);//10,20,30
                     }

                     System.out.println("===arr2的元素===");
                     for (int i =0; i <arr1.length;i++){
                            System.out.println(arr2[i]);//10,20,30
                 }

              }
       }*/


               /* package com.company;

              public class Main {

                  public static void main(String[] args) {

                           int[] arr = {11, 22, 33, 44, 55, 66,77,88,99,100,1000,10000,100000,1000000,10000000};
                           int temp = 0;
                            int len = arr.length;
                            for ( int i = 0; i < len / 2; i++) {
                                   temp = arr[len - 1 - i];
                                   arr[len - 1 - i] = arr[i];
                                   arr[i] = temp;
                            }

                            System.out.println("====翻转后数组就是一个====");
                            for (int i = 0; i < arr.length; i++){
                                System.out.print(arr[i] + "\t");
                            }

                     }

              }*/
                         /* package com.company;

                      public class Main {

                          public static void main(String[] args) {
                   int[] arr = {11, 22, 33, 44, 55, 66, 77, 88,99,100,1};
                      int[] arr2 = new int[arr.length];
                      for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                          arr2[j] = arr[i];
                      }
                      arr = arr2;
                      System.out.println("===arr的元素情况=====");

                      for (int i = 0; i < arr.length; i++) {
                          System.out.print(arr[i] + "\t");
                      }
                  }
              }*/



   /* package com.company;

      public class Main {

       public static void main(String[] args) {
           int[] arr = {1,2,3};
           int[] aerrNew =new int[arr.length + 1];
           for (int i = 0;i < arr.length;i++){
               aerrNew[i] = arr[i];

           }
           //把4赋值给arrNew最后一个元素
           aerrNew[aerrNew.length - 1] = 4;
           //让arr指向 arrNew
           arr = aerrNew;
          //输出arr
           System.out.println("====arr扩容后元素情况====");
           for (int i = 0;i < arr.length;i++){
               System.out.println(arr[i] +"\t");
}
}
}*/


   /*canner myscanner =new int(System.in);
    //初始化数组
    int[] arr = {1,2,3};
    do{
       int[] arrNew = new int[arr.length + 1];
       //遍历arr的数组，依次将arr的元素拷贝到arrNew数组
       for (int i = 0; i < arr.length;i++){
             arrNew[i] = arr[i];
}
       System.out.println("请输入你要添加的元素");
       int addNum = myscanner.nextInt();
       //把addNUM赋值给arrNew的最后一个元素
      arrNew[arrNew.length - 1] = addNum;
      //让arr指向arrnew
      arr = arrNew;
      //输出arr
      System.out.println("====arr扩容后元素的情况====“);
      for(int i = 0; i < arr.length;i++){
         System.out.print(arr[i] + "\t");
}
//问用户是否继续
      System.out.println("是否继续添加y/n");
      char key = myscanner.next().charAt(0);
      if( key == 'n'){//如果输入n就结束
        break;
}
}while(true);
 System.out.println("你退出了添加......");
}
}*/     package com.company;

        int Scanner=0;
        public class Scanner{
            public static void main(String[] args){
              int[] arr = {24,69,80,57,13};
              int temp = 0;
              for (int i = 0;i < arr.length -1;i++){
                   for (int j = 0; j < arr.length-i; j++){
                       if(arr[j] > arr[j+1]){
                          temp = arr[j];
                          arr[j] = arr[j+1];
                          arr[j+1] = temp;
                      }
                  }
             }
          }
       }