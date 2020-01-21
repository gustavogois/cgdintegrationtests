package cgd.pt.cgdintegrationtests.service.springdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class MockExamplesTest {

    @Mock
    List<String> listMock;

    @Spy
    List<String> listSpy;

    @BeforeEach
    void setUp() {
        listMock = mock(ArrayList.class);
        listSpy = spy(ArrayList.class);
    }

    @Test
    void testInlineMock() {
        Map mapInlineMock = mock(Map.class);

        assertThat(mapInlineMock.size()).isEqualTo(0);
    }

    @Test
    void testMock() {
        assertThat(listMock.size()).isEqualTo(0);

        listMock.add("Hello!");
        assertThat(listMock.size()).isEqualTo(0);
        assertThat(listMock.get(0)).isNull();

        when(listMock.size()).thenReturn(1);
        assertThat(listMock.size()).isEqualTo(1);
        assertThat(listMock.get(0)).isNull();
    }

    @Test
    void testSpy() {
        assertThat(listSpy.size()).isEqualTo(0);

        listSpy.add("Hello!");
        assertThat(listSpy.size()).isEqualTo(1);
        assertThat(listSpy.get(0)).isEqualTo("Hello!");

        when(listSpy.size()).thenReturn(0);
        assertThat(listSpy.size()).isEqualTo(0);
        assertThat(listSpy.get(0)).isEqualTo("Hello!");
    }
}
