import java.lang.System.*;

class Sort{
  public static void main(String[] args){
    System.out.println("入力データ：");
    System.out.println(args[0]);
	Tools tool = new Tools();
    int[] data = tool.S2IArr(args[0]);
	double startTime=0, endTime = 0;
	TimeMeasure tm = new TimeMeasure();

    if(String algo=args[1] != null){

	}else{
		String[] sortList = null;
		sortList = getSortList();
		for(String sortname:sortList)
	}
  }

  public static void evalSort(){

  }

  public static String[] getSortList(){
	 String[] sortList = null;
	 sortList={
		"bubble",
		"bogo",
		"cocktail",
		"comb",
		"merge",
		"oddeven",
		"quick",
		"stooge",
		"circle"
	 }
	 return sortList;
  }


  public static void selectSort(String algo){
    try{
      switch(algo){
        case "bubble":
          BubbleSort bubbleSort = new BubbleSort();
		  bubbleSort.sort(data);
          break;

        case "bogo":
          BogoSort bogoSort = new BogoSort();
          bogoSort.sort(data);
          break;

        case "cocktail":
          CocktailSort cocktailSort = new CocktailSort();
          cocktailSort.sort(data);
          break;

        case "comb":
          CombSort combSort = new CombSort();
          combSort.combSort(data);
          break;

        case "merge":
          MergeSort mergeSort = new MergeSort();
          mergeSort.mergeSort(data);
          break;

        case "oddeven":
          OddEvenSort oddEvenSort = new OddEvenSort();
          oddEvenSort.sort(data);
          break;

		case "quick":
            QuickSort quickSort = new QuickSort();
            quickSort.quickSort(data,0,data.length-1);
            break;

  		case "stooge":
              StoogeSort stoogeSort = new StoogeSort();
              stoogeSort.stoogeSort(data);
              break;

		case "circle":
            CircleSort circleSort = new CircleSort();
            CircleSort.circleSort(data);
            break;

        default:
          System.out.println("正しいアルゴリズム名を入力してください。");

        }
      }catch(RuntimeException e){
        System.out.println("正しいアルゴリズム名を入力してください。");
      }
  	}

}
