package com.kikawet.reactiveMediaServer.model;

import java.util.List;
import java.util.Set;

public class User {
	String login;
	List<VideoMetadata> videoList;
	Set<WatchedVideo> history;
}
