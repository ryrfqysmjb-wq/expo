package expo.modules.agerange

import expo.modules.kotlin.exception.CodedException

internal class AgeRangeTaskCancelledException: CodedException("Age range task cancelled.")

internal class AgeRangeDeniedException :
  CodedException("ERR_AGE_RANGE_USER_DECLINED","Age signals request was denied by parental controls.", null)
