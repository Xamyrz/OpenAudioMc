package com.craftmend.openaudiomc.generic.networking.enums;

import lombok.Getter;

public enum MediaError {

    YOUTUBE_ERR("The provided youtube video is invalid, private or is unavailable. We recommend that you upload your own content."),
    MEDIA_ERR_ABORTED("Something interrupted the network. This could be because the client lost connection or the server failed to handle the request"),
    MEDIA_ERR_NETWORK("This media file could not be loaded due to a network error. Is your url correct and supported? please check https://help.openaudiomc.net/#media for more information."),
    MEDIA_ERR_DECODE("This media file could not be loaded due to a decoding error. Is your url correct and supported? please check https://help.openaudiomc.net/#media for more information."),
    MEDIA_ERR_SRC_NOT_SUPPORTED("This media file could not be loaded due to a compatibility error. Is your url correct and supported? please check https://help.openaudiomc.net/#media for more information.");

    @Getter private final String explanation;
    MediaError(String details) {
        this.explanation = details;
    }

}
