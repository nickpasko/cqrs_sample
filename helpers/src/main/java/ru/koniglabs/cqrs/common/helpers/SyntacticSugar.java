package ru.koniglabs.cqrs.common.helpers;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by nikolay on 24.09.17.
 */
public class SyntacticSugar {
    @Nonnull
    public static <T> T ifNull(@Nullable final T val, @Nonnull final T def) {
        return val == null ? def : val;
    }
}
