class App{
    public static void main(String[] args) {
        ArrayUtil.getArray();
    }
}

class ArrayUtil{
    public static void getArray()
    {
        int [] a = {4,5,10,15,16,20,29,35,38,48,51,55,57,60,62,71,74,79,82,93,96,98,99,100,200};
        int len = a.length;
        int count = 0;

       for (int i = 0 ; i < len ; ++i){
           for (int k = i+1; k < len ; ++k){
              for (int j = k+1 ; j < len; ++j){
                  if (a[i] + a[k] == a[j]){
                      System.out.printf("[%d,%d,%d] dizisi (%d+%d=%d)%n",a[i],a[k],a[j],a[i],a[k],a[j]);
                      ++count;
                  }
              }
           }
       }
        System.out.printf("cevap %d%n",count);

    }
}
