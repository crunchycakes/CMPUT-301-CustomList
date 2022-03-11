import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TestCustomList {
    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void countCitiesTest() {
        int size = list.getCount();
        assertEquals(size, list.countCities());
        list.addCity(new City("CountTown", "CM"));
        assertEquals(size + 1, list.countCities());
    }

    @Test
    public void addCityTest() {
        int size = list.getCount();
        list.addCity(new City("FirstTown", "CM"));
        assertEquals(list.getCount(), size + 1);
    }

}
