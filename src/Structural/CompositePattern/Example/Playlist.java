package Structural.CompositePattern.Example;

import java.util.ArrayList;

/**
 * @author Bishwa on 15/10/2020
 */
public class Playlist implements IComponent {
    private String playlistName;
    private ArrayList<IComponent> playlist = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    @Override
    public void play() {
        // play song
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.playlist.forEach(playlist -> playlist.setPlaybackSpeed(speed));
    }

    @Override
    public String getName() {
        return null;
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }
}
