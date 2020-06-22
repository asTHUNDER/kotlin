// !USE_EXPERIMENTAL: kotlin.RequiresOptIn
// !DIAGNOSTICS: -UNUSED_EXPRESSION -UNUSED_PARAMETER -UNUSED_VARIABLE
// !WITH_NEW_INFERENCE

@file:OptIn(ExperimentalTypeInference::class)

import kotlin.experimental.ExperimentalTypeInference

class GenericController<T> {
    suspend fun yield(t: T) {}
    fun notYield(t: T) {}

    suspend fun yieldBarReturnType(t: T) = t
    fun barReturnType(): T = TODO()
}

fun <S> generate(@BuilderInference g: suspend GenericController<S>.() -> Unit): List<S> = TODO()

val test1 = generate {
    <!INAPPLICABLE_CANDIDATE!>yield<!>(3)
}

val test2 = generate {
    <!INAPPLICABLE_CANDIDATE!>yield<!>(3)
    <!INAPPLICABLE_CANDIDATE!>notYield<!>(3)
}

val test3 = generate {
    <!INAPPLICABLE_CANDIDATE!>yield<!>(3)
    <!INAPPLICABLE_CANDIDATE!>yieldBarReturnType<!>(3)
}

val test4 = generate {
    <!INAPPLICABLE_CANDIDATE!>yield<!>(3)
    barReturnType()
}