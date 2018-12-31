package com.turtywurty.minecraftmadness.entity.frog;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFrog extends ModelBase {
    public ModelRenderer right_foot;
    public ModelRenderer right_foot_back;
    public ModelRenderer left_leg;
    public ModelRenderer right_leg;
    public ModelRenderer body;
    public ModelRenderer right_foot_front;
    public ModelRenderer left_leg_front;
    public ModelRenderer right_leg_front;
    public ModelRenderer head;
    public ModelRenderer left_foot_front;
    public ModelRenderer left_foot;
    public ModelRenderer left_foot_back;

    public ModelFrog() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.left_leg = new ModelRenderer(this, 55, 0);
        this.left_leg.setRotationPoint(-2.0F, 21.6F, 0.3F);
        this.left_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(left_leg, 0.40980330836826856F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 36, 0);
        this.body.setRotationPoint(-2.0F, 20.7F, -3.8F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.left_leg_front = new ModelRenderer(this, 49, 14);
        this.left_leg_front.setRotationPoint(-2.0F, 20.9F, -2.6F);
        this.left_leg_front.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(left_leg_front, -0.31869712141416456F, 0.0F, 0.0F);
        this.left_foot_front = new ModelRenderer(this, 56, 8);
        this.left_foot_front.setRotationPoint(-2.0F, 23.0F, -4.4F);
        this.left_foot_front.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(left_foot_front, 0.0F, 0.0F, 0.0054105206811824215F);
        this.left_foot_back = new ModelRenderer(this, 49, 20);
        this.left_foot_back.setRotationPoint(-3.0F, 23.0F, 2.0F);
        this.left_foot_back.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(left_foot_back, 0.0F, 1.5707963267948966F, 0.0F);
        this.right_leg_front = new ModelRenderer(this, 58, 14);
        this.right_leg_front.setRotationPoint(1.0F, 20.9F, -2.6F);
        this.right_leg_front.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(right_leg_front, -0.31869712141416456F, 0.0F, 0.0F);
        this.right_foot = new ModelRenderer(this, 60, 4);
        this.right_foot.setRotationPoint(1.0F, 23.0F, 2.0F);
        this.right_foot.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(right_foot, 0.0F, 1.5707963267948966F, 0.0F);
        this.head = new ModelRenderer(this, 25, 0);
        this.head.setRotationPoint(-1.0F, 19.7F, -5.0F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.left_foot = new ModelRenderer(this, 55, 4);
        this.left_foot.setRotationPoint(-2.0F, 23.0F, 2.0F);
        this.left_foot.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(left_foot, 0.0F, 1.5707963267948966F, 0.0F);
        this.right_leg = new ModelRenderer(this, 60, 0);
        this.right_leg.setRotationPoint(1.0F, 21.6F, 0.3F);
        this.right_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(right_leg, 0.40980330836826856F, 0.0F, 0.0F);
        this.right_foot_back = new ModelRenderer(this, 58, 20);
        this.right_foot_back.setRotationPoint(2.0F, 23.0F, 2.0F);
        this.right_foot_back.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(right_foot_back, 0.004852681579911868F, 1.5707963267948966F, 0.0F);
        this.right_foot_front = new ModelRenderer(this, 47, 8);
        this.right_foot_front.setRotationPoint(1.0F, 23.0F, -4.4F);
        this.right_foot_front.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(right_foot_front, 0.0F, 0.0F, 0.0054105206811824215F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.left_leg.render(f5);
        this.body.render(f5);
        this.left_leg_front.render(f5);
        this.left_foot_front.render(f5);
        this.left_foot_back.render(f5);
        this.right_leg_front.render(f5);
        this.right_foot.render(f5);
        this.head.render(f5);
        this.left_foot.render(f5);
        this.right_leg.render(f5);
        this.right_foot_back.render(f5);
        this.right_foot_front.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
