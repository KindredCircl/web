package com.kindredcircl.web.components.sections.communityguidelines

import com.kindredcircl.web.Headline2TextStyle
import com.kindredcircl.web.Headline3TextStyle
import com.kindredcircl.web.components.models.DocumentContent
import com.kindredcircl.web.components.models.DocumentSection
import com.kindredcircl.web.util.slugify

val definitions =
    DocumentSection(
        title = "Definitions",
        anchor = slugify("Definitions"),
        headingLevel = "h2",
        style = Headline2TextStyle,
        isSubSection = false,
        children = listOf(
            DocumentSection(
                title = "A",
                anchor = slugify("A Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Account Suspension:","The temporary disabling of a user's account on KindredCircl."),
                    DocumentContent.LabeledText("Account Termination:","The permanent removal of a user's account from KindredCircl."),
                    DocumentContent.LabeledText("Astroturfing:","The practice of masking the sponsors of a message or organization to give the appearance of grassroots support.")
                )
            ),
            DocumentSection(
                title = "B",
                anchor = slugify("B Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Beacon:","A public post shared by a user on KindredCircl, visible to other users."),
                    DocumentContent.LabeledText("Block:","To prevent a user from interacting with you on KindredCircl, including viewing your profile, Beacons, Reflections, and sending Whispers."),
                    DocumentContent.LabeledText("Brigading:","A coordinated online attack, typically involving a large group of people, aimed at overwhelming or silencing a target."),
                    DocumentContent.LabeledText("Bullying:","A form of harassment that involves repeated and persistent negative behavior.")
                )
            ),
            DocumentSection(
                title = "C",
                anchor = slugify("c Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Circls:","A designated area within KindredCircl where users with shared interests can interact."),
                    DocumentContent.LabeledText("Comment:","A user's written response to a Beacon or Reflection, or another user's comment."),
                    DocumentContent.LabeledText("Content:","Any text, images, videos, audio, or other materials posted or shared on KindredCircl."),
                    DocumentContent.LabeledText("Copyright Infringement:","The use of copyrighted material without permission from the copyright owner."),
                    DocumentContent.LabeledText("CSAM (Child Sexual Abuse Material):","Any visual depiction of sexually explicit conduct involving a minor, including real, computer-generated, or drawn content.")
                )
            ),
            DocumentSection(
                title = "D",
                anchor = slugify("D Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Deepfake:","A manipulated video or audio recording that appears to be genuine."),
                    DocumentContent.LabeledText("Disinformation:","False or inaccurate information that is spread intentionally to deceive."),
                    DocumentContent.LabeledText("Diverse Opinions:","Viewpoints on debatable topics where reasonable people can disagree. These are often areas of social, political, economic, or philosophical discussion. Claims that contradict established scientific, historical, or factual consensus, or that rely on misinformation, are not considered diverse opinions. KindredCircl encourages evidence-based arguments and critical thinking in all discussions."),
                    DocumentContent.LabeledText("DM (Direct Message):","A private message sent directly from one user to one or more other users."),
                    DocumentContent.LabeledText("Doxing:","The act of publicly revealing private or identifying information about an individual or organization, usually with malicious intent.")
                )
            ),
            DocumentSection(
                title = "F",
                anchor = slugify("F Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Fair Use:","A legal doctrine that allows limited use of copyrighted material without permission for purposes such as criticism, commentary, news reporting, teaching, scholarship, or research."),
                )
            ),
            DocumentSection(
                title = "H",
                anchor = slugify("H Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Harassment:","Any unwelcome conduct that is intended to intimidate, offend, or humiliate another person, including cyberstalking, doxing, and sharing private information without consent."),
                    DocumentContent.LabeledText("Hate Speech:","Any content or behavior that promotes hatred, discrimination, or violence based on race, ethnicity, religion, gender, gender identity, gender expression, sexual orientation, disability, age, national origin, veteran status, socioeconomic status, or any other protected characteristic."),
                )
            ),
            DocumentSection(
                title = "I",
                anchor = slugify("I Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Impersonation:","The act of pretending to be another person."),
                    DocumentContent.LabeledText("Intellectual Property:","Creations of the mind, such as inventions, literary and artistic works, designs, and symbols, names, and images used in commerce."),
                )
            ),
            DocumentSection(
                title = "K",
                anchor = slugify("K Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Kin:","A user's established connections on KindredCircl, representing close relationships."),
                )
            ),
            DocumentSection(
                title = "M",
                anchor = slugify("D Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Malicious Impersonation:","Impersonation with the intent to deceive, defraud, or harm."),
                    DocumentContent.LabeledText("Misinformation:","False or inaccurate information that is spread unintentionally."),
                    DocumentContent.LabeledText("Moderator:","A KindredCircl employee responsible for enforcing the community guidelines."),
                    DocumentContent.LabeledText("Mute:","To hide a user's Beacons, Reflections, and comments from your view without blocking them."),
                )
            ),
            DocumentSection(
                title = "N",
                anchor = slugify("N Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Notifications:","Alerts sent to users regarding activity on KindredCircl, such as new Beacons, Reflections, Whispers, or comments."),
                    DocumentContent.LabeledText("NSFW (Not Safe for Work):","Content that is considered inappropriate for viewing in a professional or public setting."),
                )
            ),
            DocumentSection(
                title = "P",
                anchor = slugify("P Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Private Information:","Information that can be used to identify an individual, such as their full name, address, phone number, or social security number."),
                    DocumentContent.LabeledText("Profile:","A user's personal space on KindredCircl, containing information they choose to share, and their Beacons and Reflections."),
                )
            ),
            DocumentSection(
                title = "R",
                anchor = slugify("D Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Reflection:","A private post shared by a user on KindredCircl, representing personal thoughts or journal entries, visible only to the user or selected Kin."),
                    DocumentContent.LabeledText("Report or Reporting:","The action of notifying KindredCircl moderators about content that violates these Community Guidelines."),
                )
            ),
            DocumentSection(
                title = "S",
                anchor = slugify("S Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Search:","The function that allows users to find content, Circls, or users on KindredCircl."),
                )
            ),
            DocumentSection(
                title = "T",
                anchor = slugify("T Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Terms of Service:","The legal agreement between KindredCircl and its users, outlining the rules and conditions of using the platform."),
                    DocumentContent.LabeledText("Tier 1 Appeal:","The first step in the appeals process, reviewed by the original moderator or a different moderator from the same team."),
                    DocumentContent.LabeledText("Tier 2 Appeal:","The second step in the appeals process, reviewed by a senior moderator or a designated appeals team."),
                )
            ),
            DocumentSection(
                title = "U",
                anchor = slugify("U Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("User or Member:","Any person that has created an account, and is using the KindredCircl platform."),
                )
            ),
            DocumentSection(
                title = "W",
                anchor = slugify("W Definitions"),
                headingLevel = "h3",
                style = Headline3TextStyle,
                isSubSection = true,
                contents = listOf(
                    DocumentContent.LabeledText("Whispers:","A private direct message sent directly from one user to one or more other users."),
                )
            )
        )
    )