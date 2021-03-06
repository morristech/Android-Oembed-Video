package com.gapps.library.api.models.video

class VideoPreviewModel {
    var videoTitle: String? = null
    var url: String? = null
    var thumbnailUrl: String? = null
    var videoHosting: String? = null
    var videoId: String? = null
    var linkToPlay: String? = null
    var width = 0
    var height = 0
    var errorMessage: String? = null

    companion object {
        const val ERROR_404 = "Not found"

        const val YOUTUBE = "YouTube"
        const val YOUTUBE_MUSIC = "YouTube Music"
        const val VIMEO = "Vimeo"
        const val RUTUBE = "Rutube"
        const val FACEBOOK = "Facebook"
        const val DAILYMOTION = "Dailymotion"
        const val WISTIA = "Wistia"
        const val VZAAR = "Vzaar"
        const val HULU = "Hulu"
        const val USTREAM = "Ustream"
        const val TED_TALKS = "Ted Talks"

        fun error(url: String?, message: String? = null) = VideoPreviewModel().apply {
            this.url = url
            this.videoTitle = ERROR_404
            this.thumbnailUrl = "http://euonthemove.eu/wp-content/uploads/2017/05/no-video.jpg"
            this.errorMessage = message
        }
    }
}