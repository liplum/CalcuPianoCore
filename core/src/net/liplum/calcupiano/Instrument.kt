package net.liplum.calcupiano

interface IPiano<TKey>
        where TKey : IPianoKey {
    fun press(key: TKey)
    fun release(key: TKey)
}

interface IPianoKey {
}