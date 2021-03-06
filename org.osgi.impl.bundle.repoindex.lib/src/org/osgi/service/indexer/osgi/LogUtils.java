package org.osgi.service.indexer.osgi;

import static org.osgi.service.log.LogService.*;

final class LogUtils {

	public static String formatLogLevel(int level) {
		switch (level) {
		case LOG_DEBUG:
			return "DEBUG";
		case LOG_INFO:
			return "INFO";
		case LOG_WARNING:
			return "WARNING";
		case LOG_ERROR:
			return "ERROR";
		default:
			return "unknown";
		}
	}

}
