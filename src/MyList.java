import java.util.Objects;

public class MyList {
    private String [] list = new String[5];
    String[] newList = new String[list.length];
    private int count = 0;
    private String temp;

    public void addList(String shoppingList){
        setCapacity();
        for (int i = 0; i < list.length; i++) {

            if(list[i]== null) {
                list[i] = shoppingList;

                count++;
                break;
            }
            }
    }

    private void setCapacity(){
        if (getSize() == list.length){
            newList = list;
            list = new String[list.length * 2];

            System.arraycopy(newList, 0, list, 0, newList.length);
        }
    }

    public String [] getList() {
        return list;
    }

    public int getSize() {
       return count;
    }


    public void addList(String shoppingList, int index) {
         for (int i = getSize(); i > index; i--) {
            list[i] = list[i-1];
        }
        list[index] = shoppingList;
        count++;

    }

    public void removeListByIndex(int index) {
        for (int i = index; i < list.length - 1 ; i++) {
            list[i] = null;
            temp = list[i];
            list[i] = list[i+1];
        }
        list[list.length-1] = temp;

            count--;
    }

    public void removeListByName(String shoppingList) {

        for (int i = 0; i < list.length -1 ; i++) {
            if (Objects.equals(list[i], shoppingList)) {
                list[i] = null;
                temp = list[i];
                list[i] = list[i + 1];
            for(int j = i; j < list.length -1; j++ ){
                list[j] = list[j + 1];
            }

            }
        }
        list[list.length-1] = temp;
        count--;
    }


    public void getListByIndex(int index) {
        for (int i = 0; i < list.length; i++) {
            if (i== index){
              temp =  list[i];
            }
        }
    }
    public String getTemp(){

        return temp;
    }

    public void removeListByNameAndIndex(String shoppingList, int index) {

                 if (Objects.equals(list[index], shoppingList)) {
        for (int i = 0; i < list.length -1 ; i++) {
            if (Objects.equals(list[i], shoppingList) && i == index) {
                list[i] = null;
                temp = list[i];
                     list[i] = list[i + 1];
                     for (int j = i; j < list.length - 1; j++) {
                         list[j] = list[j + 1];
                     }
                 }

            }
                     list[list.length-1] = temp;
        count--;
        }
                 else System.out.println("shoppingList and index mismatch");
    }

    public void swapIndex(int a, int b) {

            temp = list[a];
            list[a] = list[b];
            list[b] = temp;

    }
}
