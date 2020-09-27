package com.github.grishberg.android.profiler.plugins

import com.github.grishberg.android.profiler.core.ProfileData
import com.github.grishberg.android.profiler.core.ThreadItem

data class AnalyzerMethodsInfo(
    /**
     * Analyzer message about found method.
     */
    val message: String,

    /**
     * Thread id of current method.
     */
    val thread: ThreadItem,

    /**
     * Found method.
     */
    val method: ProfileData
)
