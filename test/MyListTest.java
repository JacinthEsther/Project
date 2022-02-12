import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyListTest {

    MyList myList;
    @BeforeEach
    public void setUp(){
        myList = new MyList();
    }

    @Test
    public void listCanBeAddedTest(){
        myList.addList("shoes");
        myList.addList("teddyBear");
        assertArrayEquals(new String[]{"shoes", "teddyBear", null, null, null},myList.getList());
    }

    @Test
    public void sizeOfListCanBeGottenTest(){
        myList.addList("shoes");
        myList.addList("teddyBear");
        assertEquals(2,myList.getSize());
    }

    @Test
    public void capacityTest(){
        myList.addList("shoes");
        myList.addList("shoes");
        myList.addList("shoes");
        myList.addList("shoes");
        myList.addList("shoes");
        myList.addList("shoes");
        myList.addList("shoes");
       assertArrayEquals(new String[]{"shoes","shoes","shoes","shoes","shoes","shoes","shoes",null
       ,null,null},myList.getList());
        assertEquals(7,myList.getSize());
    }

    @Test
    public void addListByIndexTest(){
        myList.addList("perfume");
        myList.addList("shoes");
        myList.addList("dress");
        myList.addList("dress");
        myList.addList("bread");
        myList.addList("dress");

        myList.addList("bag",4);

        assertArrayEquals(new String[]{"perfume", "shoes","dress","dress","bag", "bread",
                "dress", null, null, null}, myList.getList());
    }

    @Test
    public void listCanBeRemovedByIndexTest(){
        myList.addList("perfume");
        myList.addList("shoes");
        myList.addList("dress");
        myList.addList("bag");
        //  myList.addList("house");

        myList.removeListByIndex(2);
        assertEquals(3,myList.getSize());
        assertArrayEquals(new String[]{"perfume","shoes","bag",null,null}, myList.getList());
    }

    @Test
    public void listCanBeRemovedByNameTest(){
        myList.addList("perfume");
        myList.addList("shoes");
        myList.addList("dress");
        myList.addList("box");
        myList.removeListByName("dress");

        assertEquals(3,myList.getSize());
        assertArrayEquals(new String[]{"perfume","shoes","box",null,null}, myList.getList());
    }

    @Test
    public void listCanBeRemovedByNameAndByIndexTest(){
        myList.addList("shoes");
        myList.addList("perfume");
        myList.addList("bag");
        myList.addList("box");
        myList.removeListByNameAndIndex("shoes",0);
        assertEquals(3,myList.getSize());
        assertArrayEquals(new String[]{"perfume","bag","box",null,null}, myList.getList());

    }

    @Test
    public void listCanBeGottenByIndexTest(){
        myList.addList("perfume");
        myList.addList("shoes");
        myList.addList("dress");
        myList.addList("box");
        myList.getListByIndex(3);
        assertEquals("box",myList.getTemp());
    }

    @Test
    public void listOfAnIndexCanBeSwappedTest(){
        myList.addList("perfume");
        myList.addList("shoes");
        myList.addList("dress");
        myList.addList("box");
        myList.swapIndex(0,3);
        assertArrayEquals(new String[]{"box","shoes","dress","perfume",null}, myList.getList());
    }


}
