/*
 * SonarQube Java
 * Copyright (C) 2012 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.java.checks;

import com.google.common.collect.ImmutableList;

import java.util.List;

public final class CheckList {

  public static final String REPOSITORY_KEY = "squid";

  private CheckList() {
  }

  public static List<Class> getChecks() {
    return ImmutableList.<Class> of(
        TabCharacter_S00105_Check.class,
        TooLongLine_S00103_Check.class,
        MissingNewLineAtEndOfFile_S00113_Check.class,
        // AST
        ParsingErrorCheck.class,
        BreakCheck.class,
        ContinueCheck.class,
        MethodComplexityCheck.class,
        ClassComplexityCheck.class,
        UndocumentedApiCheck.class,
        NoSonarCheck.class,
        CommentedOutCodeLineCheck.class,
        EmptyFileCheck.class,
        XPathCheck.class,
        EmptyBlock_S00108_Check.class,
        TooManyLinesOfCodeInFile_S00104_Check.class,
        TooManyParameters_S00107_Check.class,
        RawException_S00112_Check.class,
        BadMethodName_S00100_Check.class,
        BadClassName_S00101_Check.class,
        BadInterfaceName_S00114_Check.class,
        BadConstantName_S00115_Check.class,
        BadFieldName_S00116_Check.class,
        BadLocalVariableName_S00117_Check.class,
        BadAbstractClassName_S00118_Check.class,
        BadTypeParameterName_S00119_Check.class,
        BadPackageName_S00120_Check.class,
        MissingCurlyBraces_S00121_Check.class,
        TooManyStatementsPerLine_S00122_Check.class,
        LeftCurlyBraceStartLineCheck.class,
        RightCurlyBraceSameLineAsNextBlockCheck.class,
        RightCurlyBraceStartLineCheck.class,
        RightCurlyBraceDifferentLineAsNextBlockCheck.class,
        StringBufferUsageCheck.class,
        LeftCurlyBraceEndLineCheck.class,
        UselessParenthesesCheck.class,
        ObjectFinalizeCheck.class,
        ObjectFinalizeOverridenCheck.class,
        ObjectFinalizeOverridenCallsSuperFinalizeCheck.class,
        ClassVariableVisibilityCheck.class,
        ForLoopCounterChangedCheck.class,
        LabelsShouldNotBeUsedCheck.class,
        SwitchLastCaseIsDefaultCheck.class,
        EmptyStatementUsageCheck.class,
        ModifiersOrderCheck.class,
        AssignmentInSubExpressionCheck.class,
        StringEqualityComparisonCheck.class,
        TrailingCommentCheck.class,
        UselessImportCheck.class,
        LowerCaseLongSuffixCheck.class,
        MissingDeprecatedCheck.class,
        IndentationCheck.class,
        HiddenFieldCheck.class,
        DeprecatedTagPresenceCheck.class,
        FixmeTagPresenceCheck.class,
        TodoTagPresenceCheck.class,
        UtilityClassWithPublicConstructorCheck.class,
        StringLiteralInsideEqualsCheck.class,
        ReturnOfBooleanExpressionsCheck.class,
        BooleanEqualityComparisonCheck.class,
        ExpressionComplexityCheck.class,
        NestedTryCatchCheck.class,
        SystemExitCalledCheck.class,
        ReturnInFinallyCheck.class,
        IfConditionAlwaysTrueOrFalseCheck.class,
        CaseInsensitiveComparisonCheck.class,
        MethodWithExcessiveReturnsCheck.class,
        CollectionIsEmptyCheck.class,
        SynchronizedClassUsageCheck.class,
        NonStaticClassInitializerCheck.class,
        // Bytecode
        CycleBetweenPackagesCheck.class,
        DITCheck.class,
        LCOM4Check.class,
        ArchitectureCheck.class,
        CallToDeprecatedMethodCheck.class,
        CallToFileDeleteOnExitMethodCheck.class,
        UnusedProtectedMethodCheck.class,
        UnusedPrivateMethodCheck.class,
        RedundantThrowsDeclarationCheck.class,
        ThrowsCheckedExceptionCheck.class);
  }

}
