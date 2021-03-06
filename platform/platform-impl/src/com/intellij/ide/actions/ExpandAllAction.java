// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ide.actions;

import com.intellij.ide.TreeExpander;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExpandAllAction extends TreeExpandAllActionBase {
  @Override
  protected @Nullable TreeExpander getExpander(@NotNull DataContext dataContext) {
    return PlatformDataKeys.TREE_EXPANDER.getData(dataContext);
  }
}
