public class App {
    int FindCountPeople(Integer... PeopleList1){   
        int maxvalue = 0;
        int count = 0;
        if(PeopleList1.length == 0){
            
        }
        for (int i = PeopleList1.length-1;i>= 0;i--){
            if (PeopleList1[i] > 0){
                if (PeopleList1[i] > maxvalue){
                maxvalue = PeopleList1[i];
                count++;
                }
            }
        }

        return count;
    }
}
