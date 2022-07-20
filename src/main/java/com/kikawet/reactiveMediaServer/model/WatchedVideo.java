package com.kikawet.reactiveMediaServer.model;

import java.time.LocalDateTime;

public class WatchedVideo {
	User user;
	Video video;
	LocalDateTime time;
	float completionPercentage;
}
