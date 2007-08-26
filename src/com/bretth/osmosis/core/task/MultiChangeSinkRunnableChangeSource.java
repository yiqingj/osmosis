package com.bretth.osmosis.core.task;


/**
 * Defines the interface for combining multi change sink and change source
 * functionality. This is typically used by classes combining the contents of
 * two change sources.
 * 
 * @author Brett Henderson
 */
public interface MultiChangeSinkRunnableChangeSource extends MultiChangeSink, RunnableChangeSource {
	// Interface only combines functionality of its extended interfaces.
}