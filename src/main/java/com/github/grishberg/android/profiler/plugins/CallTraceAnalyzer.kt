package com.github.grishberg.android.profiler.plugins

import com.github.grishberg.android.profiler.core.AnalyzerResult
import com.github.grishberg.android.profiler.core.ThreadItem
import org.pf4j.ExtensionPoint

/**
 * Call trace analyzer interface.
 * Plugin analyzer must be implemented this interface.
 */
interface CallTraceAnalyzer : ExtensionPoint {
    /**
     * Analyzer name to be shown in menu.
     */
    fun analyzerName(): String

    /**
     * Main analyzer method.
     * [thread] - current thread, or null if should analyze all threads.
     */
    fun analyzeCallTrace(input: AnalyzerResult, thread: ThreadItem?): CallTraceAnalyzerResult
}
