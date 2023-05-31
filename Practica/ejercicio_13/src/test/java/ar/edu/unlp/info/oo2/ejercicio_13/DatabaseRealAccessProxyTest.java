package ar.edu.unlp.info.oo2.ejercicio_13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessProxyTest {
	private DatabaseAccess database;
	private DatabaseRealAccessProxy proxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseRealAccessProxy(database, "123");
        
    }

    @Test
    void testGetSearchResults() {
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=10"));
        this.proxy.login("123");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(-0, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=3"));
        this.proxy.login("123");
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
    @Test 
    void testLogIn() {
    	assertEquals(false, this.proxy.isLogged());
    	this.proxy.login("123");
    	assertEquals(true, this.proxy.isLogged());
    }
}
