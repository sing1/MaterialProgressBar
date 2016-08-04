package com.sing;

public interface ShowTrackDrawable {

    /**
     * Get whether this drawable is showing a track. The default is {@code true}.
     *
     * @return Whether this drawable is showing a track.
     */
    boolean getShowTrack();

    /**
     * Set whether this drawable should show a track. The default is {@code true}.
     *
     * @param showTrack Whether track should be shown.
     */
    void setShowTrack(boolean showTrack);
}