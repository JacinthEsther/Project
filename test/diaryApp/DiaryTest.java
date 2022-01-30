package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    @BeforeEach
    public void setUp(){
        diary = new Diary("1234", "Esther");
    }

    @Test
    public void diaryCanBeCreatedTest(){

       assertNotNull(diary);
       assertEquals("Esther", diary.getOwnerName());
    }
    @Test
    public void setDiaryPasswordTest(){

        diary.setPassword("2545");
        assertEquals("2545",diary.getPassword());
    }

    @Test
    public void diaryCanAddGistTest(){
        diary. addNewGist("Hello","Hello, new Kit","1234");
        assertEquals(1,diary.getGists("1234").size());
    }

    @Test
    public void viewGistByTitle(){
        diary. addNewGist("Hello","Hello, new Kit","1234");
        diary. addNewGist("Hi","Hi, new Kit","1234");
        diary. addNewGist("Say","Say, new Kit","1234");

        assertEquals(3,diary.getGists("1234").size());
    Gist foundGist = diary.findGistByTitle("Say");
    assertEquals("Say",foundGist.getTitle());

        System.out.println(foundGist);
    }


}