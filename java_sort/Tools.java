class Tools {
//文字列データから、数値データの配列に変換する関数
  public static int[] S2IArr(String str_number){
    int[] numbers= null;
    try{
      String[] stringNumbers = str_number.split(" ", -1);
      numbers = new int[stringNumbers.length];
      numbers  = parseint(stringNumbers);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("１つの文字列の引数を入力してください。");
    }

    return numbers;
  }

//S2IArrから呼び出される各文字列を数値に変換
  private static int[] parseint (String[] strArray)
  {
    int[] numbers = new int[strArray.length];
    for(int i=0 ; i < strArray.length ; i++){
      numbers[i]=Integer.parseInt(strArray[i]);
    }
    return numbers;
  }

//配列情報を表示する関数
  public static void dispArray(int[] numbers){
    for(int number : numbers){
      System.out.print(number);
      System.out.print(" ");
    }
    System.out.println();
    return;
  }

}
