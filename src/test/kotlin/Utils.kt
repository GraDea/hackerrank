fun Int.asArray() = this.toString().map { it.toString().toInt() }.toTypedArray()
