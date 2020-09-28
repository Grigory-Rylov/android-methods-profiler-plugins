package com.github.grishberg.android.profiler.plugins

import com.github.grishberg.android.profiler.core.AnalyzerResult
import com.github.grishberg.android.profiler.core.ThreadItem
import org.pf4j.ExtensionPoint

/**
 * Call trace analyzer interface.
 * Plugin analyzer must be implemented this interface.
 */
interface CallTraceAnalyzer : ExtensionPoint {
    interface Callback {
        /**
         * Must be called when analyze is ended.
         * @param result - contains analyze result or [EmptyCallTraceAnalyzerResult]
         */
        fun onResultReady(result: CallTraceAnalyzerResult)
    }

    /**
     * Analyzer name to be shown in menu.
     */
    fun analyzerName(): String

    /**
     * Main analyzer method.
     * @param input - input data [AnalyzerResult]
     * @param thread - current thread [ThreadItem] or null if should analyze all threads.
     * @param callback - callback for returning result.
     */
    fun analyzeCallTrace(input: AnalyzerResult, thread: ThreadItem?, callback: Callback)
}
