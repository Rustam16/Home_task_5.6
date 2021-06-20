package space.android3.home_task_56;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import space.android3.home_task_56.Data.StringGo;

import static org.junit.Assert.assertArrayEquals;

public class GetStringHelperTest {
    StringGo stringGo;

    @Before
    public void setup() {
        Context context = Mockito.mock(Context.class);
        Mockito.when(context.getString(R.string.words)).thenReturn("One two three");
        stringGo = new StringGo(context);
    }

    @Test
    public void getStringGo() {
        String[] txts = {"One", "two", "three"};
        assertArrayEquals(txts, stringGo.getString(R.string.words));
    }

    @After
    public void clear() {
        stringGo = null;
    }
}
