package com.turtywurty.minecraftmadness.entity.scorpion;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScorpion extends ModelBase 
{
    public ModelRenderer body;
    public ModelRenderer far_back_left_leg;
    public ModelRenderer far_back_right_leg;
    public ModelRenderer far_front_right_leg;
    public ModelRenderer far_front_left_leg;
    public ModelRenderer front_right_leg;
    public ModelRenderer back_right_leg;
    public ModelRenderer front_left_leg;
    public ModelRenderer back_left_leg;
    public ModelRenderer stinger_third;
    public ModelRenderer head;
    public ModelRenderer stinger_second;
    public ModelRenderer stinger_first;
    public ModelRenderer stinger_third_1;
    public ModelRenderer pincer_first_left;
    public ModelRenderer pincer_first_right;
    public ModelRenderer pincer_second_right;
    public ModelRenderer pincer_first_left_1;

    public ModelScorpion() 
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.back_left_leg = new ModelRenderer(this, 39, 0);
        this.back_left_leg.setRotationPoint(-1.9F, 22.4F, 1.0F);
        this.back_left_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(back_left_leg, 0.0F, 0.0F, 0.5918411493512771F);
        this.stinger_third = new ModelRenderer(this, 43, 0);
        this.stinger_third.setRotationPoint(-0.5F, 19.6F, 2.1F);
        this.stinger_third.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(stinger_third, 1.7756979809790308F, 0.0F, 0.0F);
        this.far_back_right_leg = new ModelRenderer(this, 15, 0);
        this.far_back_right_leg.setRotationPoint(1.0F, 22.8F, 3.0F);
        this.far_back_right_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(far_back_right_leg, 0.0F, -0.0F, -0.5464625887994246F);
        this.front_right_leg = new ModelRenderer(this, 27, 0);
        this.front_right_leg.setRotationPoint(1.0F, 22.8F, -1.0F);
        this.front_right_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(front_right_leg, 0.0F, -0.0F, -0.5464625887994246F);
        this.far_back_left_leg = new ModelRenderer(this, 0, 0);
        this.far_back_left_leg.setRotationPoint(-1.9F, 22.4F, 3.0F);
        this.far_back_left_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(far_back_left_leg, 0.0F, 0.0F, 0.5918411493512771F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(-2.0F, 22.0F, -3.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
        this.far_front_right_leg = new ModelRenderer(this, 19, 0);
        this.far_front_right_leg.setRotationPoint(1.0F, 22.8F, -3.0F);
        this.far_front_right_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(far_front_right_leg, 0.0F, -0.0F, -0.5464625887994246F);
        this.back_right_leg = new ModelRenderer(this, 31, 0);
        this.back_right_leg.setRotationPoint(1.0F, 22.8F, 1.0F);
        this.back_right_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(back_right_leg, 0.0F, -0.0F, -0.5464625887994246F);
        this.stinger_third_1 = new ModelRenderer(this, 59, 0);
        this.stinger_third_1.setRotationPoint(-0.5F, 19.3F, 2.4F);
        this.stinger_third_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(stinger_third_1, 1.0471975511965976F, 0.0F, 0.0F);
        this.pincer_first_right = new ModelRenderer(this, 15, 9);
        this.pincer_first_right.setRotationPoint(0.5F, 21.6F, -2.7F);
        this.pincer_first_right.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(pincer_first_right, 0.0F, 0.8651597102135892F, 0.0F);
        this.front_left_leg = new ModelRenderer(this, 35, 0);
        this.front_left_leg.setRotationPoint(-1.9F, 22.4F, -1.0F);
        this.front_left_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(front_left_leg, 0.0F, 0.0F, 0.5918411493512771F);
        this.stinger_second = new ModelRenderer(this, 53, 0);
        this.stinger_second.setRotationPoint(-0.5F, 21.5F, 3.6F);
        this.stinger_second.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(stinger_second, 1.5481070465189704F, 0.0F, 0.0F);
        this.pincer_first_left = new ModelRenderer(this, 0, 3);
        this.pincer_first_left.setRotationPoint(-1.9F, 21.6F, -4.2F);
        this.pincer_first_left.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(pincer_first_left, 0.0F, -0.8651597102135892F, 0.0F);
        this.far_front_left_leg = new ModelRenderer(this, 23, 0);
        this.far_front_left_leg.setRotationPoint(-1.9F, 22.4F, -3.0F);
        this.far_front_left_leg.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(far_front_left_leg, 0.0F, 0.0F, 0.5918411493512771F);
        this.pincer_second_right = new ModelRenderer(this, 21, 3);
        this.pincer_second_right.setRotationPoint(1.6F, 21.6F, -3.3F);
        this.pincer_second_right.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(pincer_second_right, 0.0F, 1.8668041679331349F, 0.0F);
        this.head = new ModelRenderer(this, 45, 0);
        this.head.setRotationPoint(-1.0F, 21.0F, -3.0F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.pincer_first_left_1 = new ModelRenderer(this, 27, 3);
        this.pincer_first_left_1.setRotationPoint(-1.4F, 21.6F, -5.4F);
        this.pincer_first_left_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(pincer_first_left_1, 0.0F, -1.730144887501979F, 0.0F);
        this.stinger_first = new ModelRenderer(this, 51, 0);
        this.stinger_first.setRotationPoint(-0.5F, 22.1F, 3.3F);
        this.stinger_first.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(stinger_first, 1.2747884856566583F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.back_left_leg.render(f5);
        this.stinger_third.render(f5);
        this.far_back_right_leg.render(f5);
        this.front_right_leg.render(f5);
        this.far_back_left_leg.render(f5);
        this.body.render(f5);
        this.far_front_right_leg.render(f5);
        this.back_right_leg.render(f5);
        this.stinger_third_1.render(f5);
        this.pincer_first_right.render(f5);
        this.front_left_leg.render(f5);
        this.stinger_second.render(f5);
        this.pincer_first_left.render(f5);
        this.far_front_left_leg.render(f5);
        this.pincer_second_right.render(f5);
        this.head.render(f5);
        this.pincer_first_left_1.render(f5);
        this.stinger_first.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
