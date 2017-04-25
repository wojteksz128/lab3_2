import edu.iis.mto.staticmock.PublishableNews;

import java.util.List;

/**
 * Created by Wojciech Szczepaniak on 25.04.2017.
 */
public class PublishableNewsViewer extends PublishableNews {

    public List<String> getPublicContent() {
        return publicContent;
    }

    public List<String> getSubscribentContent() {
        return subscribentContent;
    }
}
