package com.stremio.addon.service;

import com.stremio.core.model.MetaItem;
import com.stremio.core.model.Stream;
import com.stremio.core.service.MetaItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaItemServiceImpl implements MetaItemService {

    @Override
    public MetaItem findOne(String id) {
        MetaItem meta = MetaItem.builder().build();
        if (id.startsWith("hiwrld_")) {
            meta.setMeta(MetaItem.builder()
                    .id(id)
                    .type("movie")
                    .name("Jellyfish")
                    .poster("https://images.unsplash.com/photo-1496108493338-3b30de66f9be")
                    .genres(List.of("Demo", "Nature"))
                    .description("A .mkv video clip useful for testing the network streaming and playback performance of media streamers & HTPCs.")
                    .cast(List.of("Some random jellyfishes"))
                    .director(List.of("ScottAllyn"))
                    .logo("https://b.kisscc0.com/20180705/yee/kisscc0-art-forms-in-nature-jellyfish-recapitulation-theor-jellyfish-5b3dcabcb00692.802484341530776252721.png")
                    .background("https://images.unsplash.com/photo-1461783470466-185038239ee3")
                    .runtime("30 sec")
                    .build());
        }

        return meta;
    }

    @Override
    public MetaItem findStreams(String videoId) {
        List<Stream> streams = List.of();
        if (videoId.equals("hiwrld_jellyfish")) {
            streams = List.of(
                    Stream.builder().title("Web, 3 MBps, HD").url("http://jell.yfish.us/media/jellyfish-3-mbps-hd-h264.mkv").build(),
                    Stream.builder().title("Web 15 MBps, HD").url("http://jell.yfish.us/media/jellyfish-15-mbps-hd-h264.mkv").build(),
                    Stream.builder().title("Web, 120 MBps, 4K").url("http://jell.yfish.us/media/jellyfish-120-mbps-4k-uhd-h264.mkv").build()
            );
        }

        return MetaItem.builder().streams(streams).build();
    }
}
