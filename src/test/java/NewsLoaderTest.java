import edu.iis.mto.staticmock.*;
import edu.iis.mto.staticmock.reader.NewsReader;
import org.junit.Assert;
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

    private ConfigurationLoader configurationLoader;
    private NewsReaderFactory newsReaderFactory;
    private IncomingNews incomingNews;


    @Before
    public void setUp() {
        mockStatic(ConfigurationLoader.class, NewsReaderFactory.class);

        Configuration configuration = mock(Configuration.class);
        when(configuration.getReaderType()).thenReturn("");

        configurationLoader = mock(ConfigurationLoader.class);
        when(ConfigurationLoader.getInstance()).thenReturn(configurationLoader);
        when(configurationLoader.loadConfiguration()).thenReturn(configuration);

        incomingNews = new IncomingNews();

        NewsReader newsReader = mock(NewsReader.class);
        when(newsReader.read()).thenReturn(incomingNews);

        newsReaderFactory = mock(NewsReaderFactory.class);
        when(NewsReaderFactory.getReader(any(String.class))).thenReturn(newsReader);
    }

    @Test
    public void validateSplitingNews() {
        // given
        NewsLoader newsLoader = new NewsLoader();

        // when
        PublishableNews news = newsLoader.loadNews();

        // then
        //Assert.assertThat(news.);
    }
}
