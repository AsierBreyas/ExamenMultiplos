package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import app.*;

class MultiplosTest {
    @Test
    @DisplayName("Test1")

    void multiplode3(){
        Multiplos multi = new Multiplos();
        String resultado = multi.metodo1(9);
        assertEquals("Face", resultado );
    }
    @Test
    @DisplayName("Test2")

    void multiplode5(){
        Multiplos multi = new Multiplos();
        String resultado = multi.metodo1(10);
        assertEquals("book", resultado );
    }
    @Test
    @DisplayName("Test3")

    void multiplode3y5(){
        Multiplos multi = new Multiplos();
        String resultado = multi.metodo1(15);
        assertEquals("Facebook", resultado );
    }
    @Test
    @DisplayName("Test4")

    void multiplodenada(){
        Multiplos multi = new Multiplos();
        String resultado = multi.metodo1(4);
        assertEquals("4", resultado );
    }
    @Test
    @DisplayName("Test5")

    void test1(){
        Multiplos multi = new Multiplos();
        String resultado = multi.metodo2(new int[]{1,2,3});
        assertEquals("1 2 Face", resultado );
    }
    @Test
    @DisplayName("Test6")

    void test2(){
        Multiplos multi = new Multiplos();
        String resultado = multi.metodo2(new int[]{6,10,30,2,19});
        assertEquals("Face book Facebook 2 19", resultado );
    }
    @Test
    @DisplayName("Test7")

    void test3(){
        Multiplos multi = new Multiplos();
        String resultado = multi.metodo2(new int[]{4,6,8,11});
        assertEquals("4 Face 8 11", resultado );
    }
}