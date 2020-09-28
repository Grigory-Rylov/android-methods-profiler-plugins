package com.github.grishberg.android.profiler.plugins

class EmptyCallTraceAnalyzerResult : CallTraceAnalyzerResult {
    override fun overview(): String = ""

    override fun foundMethods(): List<AnalyzerMethodsInfo> = emptyList()
}
