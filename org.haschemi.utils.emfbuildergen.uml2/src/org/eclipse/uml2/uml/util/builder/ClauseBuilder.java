package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Clause</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClauseBuilder {
  // features and builders
  private org.eclipse.uml2.uml.OutputPin m_decider;
  private org.eclipse.uml2.uml.util.builder.OutputPinBuilder m_featureDeciderBuilder;
  private java.util.Collection<org.eclipse.uml2.uml.ExecutableNode> m_body = new java.util.LinkedList<org.eclipse.uml2.uml.ExecutableNode>();
  private java.util.Collection<org.eclipse.uml2.uml.OutputPin> m_bodyOutput = new java.util.LinkedList<org.eclipse.uml2.uml.OutputPin>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.OutputPinBuilder> m_featureBodyOutputBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.OutputPinBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Clause> m_predecessorClause = new java.util.LinkedList<org.eclipse.uml2.uml.Clause>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ClauseBuilder> m_featurePredecessorClauseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ClauseBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Clause> m_successorClause = new java.util.LinkedList<org.eclipse.uml2.uml.Clause>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ClauseBuilder> m_featureSuccessorClauseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ClauseBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ExecutableNode> m_test = new java.util.LinkedList<org.eclipse.uml2.uml.ExecutableNode>();
  // helper attributes
  private boolean m_featureBodySet = false;
  private boolean m_featureBodyOutputSet = false;
  private boolean m_featureDeciderSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featurePredecessorClauseSet = false;
  private boolean m_featureSuccessorClauseSet = false;
  private boolean m_featureTestSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newClauseBuilder()
   */
  private ClauseBuilder() {
  }

  /**
   * This method creates a new instance of the ClauseBuilder.
   * @return new instance of the ClauseBuilder
   */
  public static ClauseBuilder newClauseBuilder() {
    return new ClauseBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ClauseBuilder but() {
    ClauseBuilder _builder = newClauseBuilder();
    _builder.m_featureBodySet = m_featureBodySet;
    _builder.m_body = m_body;
    _builder.m_featureBodyOutputSet = m_featureBodyOutputSet;
    _builder.m_bodyOutput = m_bodyOutput;
    _builder.m_featureBodyOutputBuilder = m_featureBodyOutputBuilder;
    _builder.m_featureDeciderSet = m_featureDeciderSet;
    _builder.m_decider = m_decider;
    _builder.m_featureDeciderBuilder = m_featureDeciderBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featurePredecessorClauseSet = m_featurePredecessorClauseSet;
    _builder.m_predecessorClause = m_predecessorClause;
    _builder.m_featurePredecessorClauseBuilder = m_featurePredecessorClauseBuilder;
    _builder.m_featureSuccessorClauseSet = m_featureSuccessorClauseSet;
    _builder.m_successorClause = m_successorClause;
    _builder.m_featureSuccessorClauseBuilder = m_featureSuccessorClauseBuilder;
    _builder.m_featureTestSet = m_featureTestSet;
    _builder.m_test = m_test;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Clause type.
   * @return new instance of the org.eclipse.uml2.uml.Clause type
   */
  public org.eclipse.uml2.uml.Clause build() {
    final org.eclipse.uml2.uml.Clause _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createClause();
    if (m_featureDeciderSet) {
      _newInstance.setDecider(m_decider);
    } else {
      if (m_featureDeciderBuilder != null) {
        _newInstance.setDecider(m_featureDeciderBuilder.build());
      }
    }
    if (m_featureBodySet) {
      _newInstance.getBodies().addAll(m_body);
    }
    if (m_featureBodyOutputSet) {
      _newInstance.getBodyOutputs().addAll(m_bodyOutput);
    } else {
      if (!m_featureBodyOutputBuilder.isEmpty()) {
        for (OutputPinBuilder builder : m_featureBodyOutputBuilder) {
          _newInstance.getBodyOutputs().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (CommentBuilder builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    if (m_featurePredecessorClauseSet) {
      _newInstance.getPredecessorClauses().addAll(m_predecessorClause);
    } else {
      if (!m_featurePredecessorClauseBuilder.isEmpty()) {
        for (ClauseBuilder builder : m_featurePredecessorClauseBuilder) {
          _newInstance.getPredecessorClauses().add(builder.build());
        }
      }
    }
    if (m_featureSuccessorClauseSet) {
      _newInstance.getSuccessorClauses().addAll(m_successorClause);
    } else {
      if (!m_featureSuccessorClauseBuilder.isEmpty()) {
        for (ClauseBuilder builder : m_featureSuccessorClauseBuilder) {
          _newInstance.getSuccessorClauses().add(builder.build());
        }
      }
    }
    if (m_featureTestSet) {
      _newInstance.getTests().addAll(m_test);
    }
    return _newInstance;
  }

  public ClauseBuilder withDecider(org.eclipse.uml2.uml.OutputPin p_decider) {
    m_decider = p_decider;
    m_featureDeciderSet = true;
    return this;
  }

  public ClauseBuilder withDecider(org.eclipse.uml2.uml.util.builder.OutputPinBuilder p_outputPinBuilder) {
    m_featureDeciderBuilder = p_outputPinBuilder;
    return this;
  }

  public ClauseBuilder withBody(org.eclipse.uml2.uml.ExecutableNode p_body) {
    m_body.add(p_body);
    m_featureBodySet = true;
    return this;
  }

  public ClauseBuilder withBody(java.util.Collection<? extends org.eclipse.uml2.uml.ExecutableNode> p_body) {
    m_body.addAll(p_body);
    m_featureBodySet = true;
    return this;
  }

  public ClauseBuilder withBodyOutput(org.eclipse.uml2.uml.OutputPin p_bodyOutput) {
    m_bodyOutput.add(p_bodyOutput);
    m_featureBodyOutputSet = true;
    return this;
  }

  public ClauseBuilder withBodyOutput(java.util.Collection<? extends org.eclipse.uml2.uml.OutputPin> p_bodyOutput) {
    m_bodyOutput.addAll(p_bodyOutput);
    m_featureBodyOutputSet = true;
    return this;
  }

  public ClauseBuilder withBodyOutput(OutputPinBuilder p_outputPinBuilder) {
    m_featureBodyOutputBuilder.add(p_outputPinBuilder);
    return this;
  }

  public ClauseBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ClauseBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ClauseBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ClauseBuilder withPredecessorClause(org.eclipse.uml2.uml.Clause p_predecessorClause) {
    m_predecessorClause.add(p_predecessorClause);
    m_featurePredecessorClauseSet = true;
    return this;
  }

  public ClauseBuilder withPredecessorClause(java.util.Collection<? extends org.eclipse.uml2.uml.Clause> p_predecessorClause) {
    m_predecessorClause.addAll(p_predecessorClause);
    m_featurePredecessorClauseSet = true;
    return this;
  }

  public ClauseBuilder withPredecessorClause(ClauseBuilder p_clauseBuilder) {
    m_featurePredecessorClauseBuilder.add(p_clauseBuilder);
    return this;
  }

  public ClauseBuilder withSuccessorClause(org.eclipse.uml2.uml.Clause p_successorClause) {
    m_successorClause.add(p_successorClause);
    m_featureSuccessorClauseSet = true;
    return this;
  }

  public ClauseBuilder withSuccessorClause(java.util.Collection<? extends org.eclipse.uml2.uml.Clause> p_successorClause) {
    m_successorClause.addAll(p_successorClause);
    m_featureSuccessorClauseSet = true;
    return this;
  }

  public ClauseBuilder withSuccessorClause(ClauseBuilder p_clauseBuilder) {
    m_featureSuccessorClauseBuilder.add(p_clauseBuilder);
    return this;
  }

  public ClauseBuilder withTest(org.eclipse.uml2.uml.ExecutableNode p_test) {
    m_test.add(p_test);
    m_featureTestSet = true;
    return this;
  }

  public ClauseBuilder withTest(java.util.Collection<? extends org.eclipse.uml2.uml.ExecutableNode> p_test) {
    m_test.addAll(p_test);
    m_featureTestSet = true;
    return this;
  }
}
