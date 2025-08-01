package exercism.Boolean;

public class Operations {

    class AnnalynsInfiltration {
        public static boolean canFastAttack(boolean knightIsAwake) {

            boolean decision = true;

            if (knightIsAwake == decision) {
                return false;
            } else {
                return true;
            }
        }

        public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

            boolean decisionFalse = false;

            if (knightIsAwake == decisionFalse && archerIsAwake == decisionFalse && prisonerIsAwake == decisionFalse) {
                return false;
            } else {
                return true;
            }
        }

        public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

            boolean decisionTrue = true;
            boolean decisionFalse = false;

            if (archerIsAwake == decisionFalse && prisonerIsAwake == decisionTrue) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

            boolean decisionTrue = true;
            boolean decisionFalse = false;

            if ((knightIsAwake == decisionFalse && archerIsAwake == decisionFalse) && (prisonerIsAwake == decisionTrue || petDogIsPresent == decisionTrue)) {
                return true;
            } else if ((knightIsAwake == decisionTrue && archerIsAwake == decisionFalse) && (prisonerIsAwake == decisionTrue && petDogIsPresent == decisionFalse)) {
                return false;
            } else if ((knightIsAwake == decisionTrue && archerIsAwake == decisionFalse) && (prisonerIsAwake == decisionTrue || petDogIsPresent == decisionTrue)) {
                return true;
            } else {
                return false;
            }
        }

    }
}
