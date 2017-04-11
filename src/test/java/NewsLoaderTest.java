import edu.iis.mto.staticmock.ConfigurationLoader;
import edu.iis.mto.staticmock.NewsReaderFactory;
import edu.iis.mto.staticmock.reader.NewsReader;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * Created by Wojciech Szczepaniak on 28.03.2017.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({ConfigurationLoader.class, NewsReaderFactory.class})
public class NewsLoaderTest {

    @Before
    public void setUp() {
        mockStatic(ConfigurationLoader.class, NewsReaderFactory.class);
        ConfigurationLoader configurationLoader = mock(ConfigurationLoader.class);
        when(ConfigurationLoader.getInstance()).thenReturn(configurationLoader);

        NewsReader newsReader = mock(NewsReader.class);

        NewsReaderFactory newsReaderFactory = mock(NewsReaderFactory.class);
        when(NewsReaderFactory.getReader(any(String.class))).thenReturn(newsReader);
    }

    @Test
    public void validateSplitingNews() {
        // given

        // when

        // then

    }
}
