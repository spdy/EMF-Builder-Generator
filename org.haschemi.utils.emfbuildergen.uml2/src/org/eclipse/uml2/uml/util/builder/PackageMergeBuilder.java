package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.PackageMerge</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PackageMergeBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Package m_mergedPackage;
  private org.eclipse.uml2.uml.util.builder.PackageBuilder m_featureMergedPackageBuilder;
  private org.eclipse.uml2.uml.Package m_receivingPackage;
  private org.eclipse.uml2.uml.util.builder.PackageBuilder m_featureReceivingPackageBuilder;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureMergedPackageSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureReceivingPackageSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newPackageMergeBuilder()
   */
  private PackageMergeBuilder() {
  }

  /**
   * This method creates a new instance of the PackageMergeBuilder.
   * @return new instance of the PackageMergeBuilder
   */
  public static PackageMergeBuilder newPackageMergeBuilder() {
    return new PackageMergeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public PackageMergeBuilder but() {
    PackageMergeBuilder _builder = newPackageMergeBuilder();
    _builder.m_featureMergedPackageSet = m_featureMergedPackageSet;
    _builder.m_mergedPackage = m_mergedPackage;
    _builder.m_featureMergedPackageBuilder = m_featureMergedPackageBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureReceivingPackageSet = m_featureReceivingPackageSet;
    _builder.m_receivingPackage = m_receivingPackage;
    _builder.m_featureReceivingPackageBuilder = m_featureReceivingPackageBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.PackageMerge type.
   * @return new instance of the org.eclipse.uml2.uml.PackageMerge type
   */
  public org.eclipse.uml2.uml.PackageMerge build() {
    final org.eclipse.uml2.uml.PackageMerge _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createPackageMerge();
    if (m_featureMergedPackageSet) {
      _newInstance.setMergedPackage(m_mergedPackage);
    } else {
      if (m_featureMergedPackageBuilder != null) {
        _newInstance.setMergedPackage(m_featureMergedPackageBuilder.build());
      }
    }
    if (m_featureReceivingPackageSet) {
      _newInstance.setReceivingPackage(m_receivingPackage);
    } else {
      if (m_featureReceivingPackageBuilder != null) {
        _newInstance.setReceivingPackage(m_featureReceivingPackageBuilder.build());
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
    return _newInstance;
  }

  public PackageMergeBuilder withMergedPackage(org.eclipse.uml2.uml.Package p_mergedPackage) {
    m_mergedPackage = p_mergedPackage;
    m_featureMergedPackageSet = true;
    return this;
  }

  public PackageMergeBuilder withMergedPackage(org.eclipse.uml2.uml.util.builder.PackageBuilder p_packageBuilder) {
    m_featureMergedPackageBuilder = p_packageBuilder;
    return this;
  }

  public PackageMergeBuilder withReceivingPackage(org.eclipse.uml2.uml.Package p_receivingPackage) {
    m_receivingPackage = p_receivingPackage;
    m_featureReceivingPackageSet = true;
    return this;
  }

  public PackageMergeBuilder withReceivingPackage(org.eclipse.uml2.uml.util.builder.PackageBuilder p_packageBuilder) {
    m_featureReceivingPackageBuilder = p_packageBuilder;
    return this;
  }

  public PackageMergeBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public PackageMergeBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public PackageMergeBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
