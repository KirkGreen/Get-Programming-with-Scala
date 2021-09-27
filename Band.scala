class Member(n: String, r: String, v: Boolean) {
  var name: String = n
  var role: String = r
  var vocal: Boolean = v
}

class Guitarist(n: String, v: Boolean) extends Member(n, "Guitar", v)

class Bassist(n: String, v: Boolean) extends Member(n, "Bass", v)

class Drummer(n: String, v: Boolean) extends Member(n, "Drum", v)

class Artist(g: String, m: Member) {
  val title: String = m.name
  val genre: String = g
  val member: Member = m
}

class Band(t: String, g: String, m: Set[Member]) extends Artist(g, m.head) {
  override val title: String = t
  val members: Set[Member] = m
}
