public class App {
    public static void main(String[] args) throws Exception {
        int[] PeopleList1 = {2, 9, 7, 6, 3};
                      //    {4, 7, 2, 5, 1};   
                      //    {5, 6, 9, 1, 4};  
                      //    {4, 2, 5, 6, 2};   
                      //    {4, 2, 0, 8, 5};   
        int x = 0;
        for(int i = PeopleList1.length-1; i >= 0 ;i--){
           if(i != 0){     
            if(PeopleList1[i] <= PeopleList1[i-1]){
                        System.out.print(PeopleList1[i]);
                        x+=1;
                    }}
        }
        x+=1;
        System.out.print("sum : "+x);
    }
}
