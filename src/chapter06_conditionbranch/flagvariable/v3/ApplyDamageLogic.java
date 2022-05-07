package chapter06_conditionbranch.flagvariable.v3;

import java.util.HashMap;
import java.util.Map;

public class ApplyDamageLogic {
  private final Map<DamageType, Damage> damages;

  ApplyDamageLogic() {
    damages = new HashMap<>();
  }

  void applyDamage(final DamageType damageType, final int damageAmount) {
    final Damage damage = damages.get(damageType);
    damage.execute(damageAmount);
  }
}
