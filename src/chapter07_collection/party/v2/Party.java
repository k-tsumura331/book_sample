package chapter07_collection.party.v2;

import chapter07_collection.party.Member;

import java.util.ArrayList;
import java.util.List;

class Party {
  static final int MAX_MEMBER_COUNT = 4;
  private final List<Member> members;

  Party() {
    members = new ArrayList<Member>();
  }

  private Party(List<Member> members) {
    this.members = members;
  }

  /**
   * メンバーを追加する
   * @param newMember 追加したいメンバー
   * @return メンバー追加後のパーティ
   */
  Party add(final Member newMember) {
    if (exists(newMember)) {
      throw new RuntimeException("既にパーティに加わっています。");
    }
    if (isFull()) {
      throw new RuntimeException("これ以上メンバーを追加できません。");
    }

    final List<Member> adding = new ArrayList<>(members);
    adding.add(newMember);
    return new Party(adding);
  }

  /** @return パーティのメンバーが1人でも生存している場合true */
  boolean isAlive() {
    return members.stream().anyMatch(each -> each.isAlive());
  }

  /**
   * @param member パーティに所属してるかを調べたいメンバー
   * @return すでにパーティに所属している場合true
   */
  boolean exists(final Member member) {
    return members.stream().anyMatch(each -> each.id == member.id);
  }

  /** @return パーティが満員の場合true */
  boolean isFull() {
    return members.size() == MAX_MEMBER_COUNT;
  }
}
