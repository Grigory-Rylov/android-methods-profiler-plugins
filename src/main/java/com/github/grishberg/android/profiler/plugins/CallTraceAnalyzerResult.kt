package com.github.grishberg.android.profiler.plugins

interface CallTraceAnalyzerResult {
    /**
     * Shows analyzer overview information.
     */
    fun overview(): String

    /**
     * Returns list of analyzed methods with analyzed message.
     */
    fun foundMethods(): List<AnalyzerMethodsInfo>
}
