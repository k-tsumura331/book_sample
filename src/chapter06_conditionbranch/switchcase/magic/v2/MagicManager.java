package chapter06_conditionbranch.switchcase.magic.v2;

import chapter06_conditionbranch.switchcase.magic.MagicType;
import chapter06_conditionbranch.switchcase.magic.Member;

public class MagicManager {
  String getName(MagicType magicType) {
    String name = "";

    switch (magicType) {
      // 中略
      case hellFire:
        name = "地獄の業火";
        break;
    }

    return name;
  }

  int costMagicPoint(MagicType magicType, Member member) {
    int magicPoint = 0;

    switch (magicType) {
      // 中略
      case hellFire:
        magicPoint = 16;
        break;
    }

    return magicPoint;
  }

  int attackPower(MagicType magicType, Member member) {
    int attackPower = 0;

    switch (magicType) {
      // 中略
      // case hellFile: の追加を忘れていた
    }

    return attackPower;
  }

  int costTechnicalPoint(MagicType magicType, Member member) {
    int technicalPoint = 0;

    switch (magicType) {
      case fire:
        technicalPoint = 0;
        break;
      case shiden:
        technicalPoint = 5;
        break;
    }

    return technicalPoint;
  }
}
